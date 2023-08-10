package com.example.modulo6.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Inicio {

    @GetMapping("/inicio")
    public String mostrarInicio(){

        return "index";
    }
}
