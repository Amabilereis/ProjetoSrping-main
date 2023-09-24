package com.unicsul.ProjetoNota.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MediaFinalController {

   @Autowired
    @Qualifier ("recadoR")
    private String recadoR;

    @Autowired
    @Qualifier("appRecado")
    private String appRecado;

    @GetMapping("/")
    public String home(ModelMap model){
        model.addAttribute("appRecado", appRecado);
        return "home";
    }
    @GetMapping("/saudacao/{nome}")
    public String saudacao(@PathVariable String nome, ModelMap model){
        model.addAttribute("nome", nome);
        return "saudacao";
    }

    @GetMapping("/calcular-media/{valor1}/{valor2}")
    public String calcularMedia(@PathVariable double valor1, @PathVariable double valor2, ModelMap model){

        double mediaFinal = (valor1 + valor2) / 2;
           
        model.addAttribute("mediaFinal", mediaFinal);
        model.addAttribute("recadoR", recadoR);
        return "media";

    }
}