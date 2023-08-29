package com.example.modulo6.controllers;

import com.example.modulo6.models.Contacto;
import com.example.modulo6.services.ContactoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class ContactoController {

    @Autowired
    private ContactoService contactoService;

    @GetMapping("/contacto")
    public String mostrarContacto(){
        return "contactoView";
    }

    @PostMapping("/guardarContacto")
    public String guardarContacto(@RequestParam("nombre") String nombre,
                                  @RequestParam("correo") String correo,
                                  @RequestParam("comentario") String comentario){
        Contacto contacto = new Contacto(nombre,correo,comentario);
        contactoService.guardarContacto(contacto);
        log.info("contacto guardado");

        return "contactoView";
    }
}


