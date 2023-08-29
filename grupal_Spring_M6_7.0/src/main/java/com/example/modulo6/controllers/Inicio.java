package com.example.modulo6.controllers;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class Inicio {

    @GetMapping("/inicio")
    public String mostrarInicio(){
        return "paginaInicio";
    }

    @GetMapping("/login")
    public String mostrarLogin(){
        return "login";
    }

    @GetMapping("/administrativo")
    public String mostrarinicioAdmin(){
        return "paginaInicioAdministrativo";
    }

    @GetMapping("/cliente")
    public String mostrarinicioCliente(){
        return "paginaInicioCliente";
    }

    @GetMapping("/profesional")
    public String mostrarinicioProfesional(){
        return "paginaInicioProfesional";
    }

}
