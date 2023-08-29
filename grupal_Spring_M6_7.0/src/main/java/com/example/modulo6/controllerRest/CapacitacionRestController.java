package com.example.modulo6.controllerRest;

import com.example.modulo6.models.Capacitacion;
import com.example.modulo6.services.CapacitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CapacitacionRestController {
    @Autowired
    private CapacitacionService capacitacionService;

    @PostMapping("/capacitacion")
    public ResponseEntity<List<Capacitacion>> obtenerCapacitaciones(@RequestBody Capacitacion capacitacion){
        Capacitacion nuevaCapacitacion = new Capacitacion(capacitacion.getRutCliente(),
                                            capacitacion.getDia(),
                                            capacitacion.getHora(),
                                            capacitacion.getLugar(),
                                            capacitacion.getDuracion(),
                                            capacitacion.getCantAsistentes());
        capacitacionService.guardarCapacitacion(nuevaCapacitacion);
        return new ResponseEntity<>(capacitacionService.obtenerCapacitaciones(), HttpStatus.OK);
    }

    @GetMapping("/capacitaciones")
    public ResponseEntity<List<Capacitacion>> capacitaciones(){
        return new ResponseEntity<>(capacitacionService.obtenerCapacitaciones(), HttpStatus.OK);
    }
}
