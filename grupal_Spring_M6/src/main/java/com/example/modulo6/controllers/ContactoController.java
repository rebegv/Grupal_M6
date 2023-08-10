package com.example.modulo6.controllers;

import com.example.modulo6.models.Capacitacion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactoController {

    @GetMapping("/contacto")
    public String mostrarContacto(){
        return "contactoView";
    }

    @PostMapping("/guardarContacto")
    public String guardarContacto(){
        return "contactoView";
    }
}


