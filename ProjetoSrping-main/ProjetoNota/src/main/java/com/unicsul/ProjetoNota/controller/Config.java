package com.unicsul.ProjetoNota.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean (name = "recadoR")
    public String recadoR(){
        String recado = "Aqui mostra o resultado da média";
        return recado;
    }

    @Bean (name = "appRecado")
    public String appRecado(){
        String app = "Seja bem-vindo";
        return app;
    }

}