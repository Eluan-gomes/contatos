package br.com.senai.contatos.controllers;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
/*import org.springframework.web.servlet.ModelAndView;*/

import br.com.senai.contatos.domains.Pessoa;

@Controller
public class HomeController {
    
    @GetMapping("/")
    private String home(ModelMap model) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNomeCompleto("eluan de jesus");
        pessoa.setDataNascimento(LocalDate.of(2006, 12, 19));
        model.addAttribute("p", pessoa);
        return "/home/index";
    }
    /*@GetMapping("/teste")
    public ModelAndView home2() {

        String texto = "Usando Model And view";
        ModelAndView model = new ModelAndView("/home/teste");
        model.addObject("mensagem", texto);
        return model;
    }*/
}
