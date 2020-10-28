package br.edu.usj.ads.lpii.hellonameemail;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloNameEmail {

    @PostMapping(value="nameEmail")
    public ModelAndView postNameEmail(@RequestParam String nome, @RequestParam String email) {
        ModelAndView mv = new ModelAndView("name-email");

    
        String bemVindo = "Seja bem-vindo, " + nome + ", seu e-mail é " + email + " !";
        mv.addObject("mensagem", bemVindo);

        return mv;
    }
    
}
