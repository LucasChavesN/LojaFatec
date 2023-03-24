package com.example.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/departamento/{nomeDepartamento}")
    public String departamento(@PathVariable String nomeDepartamento, ModelMap model) {
        model.addAttribute("nome", nomeDepartamento);
        return factory(nomeDepartamento);
    }

    @GetMapping
    public String factory(String entrada){
        if(entrada == "lanche"){
            return "lanche";

        } else if(entrada == "carro"){
            return "carro";

        } else if(entrada == "perfume"){
            return "perfume";

        } else {
            return "invalida";

        }
    }



}