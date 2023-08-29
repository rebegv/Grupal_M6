package com.example.modulo6.controllers;


import com.example.modulo6.models.Capacitacion;
import com.example.modulo6.services.CapacitacionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class CapacitacionController {

    @Autowired
    private CapacitacionService capacitacionService;

    @GetMapping("/crearCapacitacion")
    public String mostrarFormularioCapacitacion(){

        return "crearCapacitacionView";
    }

    @PostMapping("/guardarCapacitacion")
    public String guardarCapacitacion(@RequestParam("rutCliente") String rutCliente,
                                      @RequestParam("dia") String dia,
                                      @RequestParam("hora") String hora,
                                      @RequestParam("lugar") String lugar,
                                      @RequestParam("duracion") String duracion,
                                      @RequestParam("cantAsistentes") String cantAsistentes){
        Capacitacion capacitacion = new Capacitacion(rutCliente,dia,hora,lugar,duracion,Integer.parseInt(cantAsistentes));
        capacitacionService.guardarCapacitacion(capacitacion);
        log.info("capacitacion guardada");

        return "crearCapacitacionView";
    }

    @GetMapping("/listarCapacitaciones")
    public String listarCapacitaciones(Model model){
        model.addAttribute("listaCapacitaciones", capacitacionService.obtenerCapacitaciones());
        return "listarCapacitacionesView";
    }

}


