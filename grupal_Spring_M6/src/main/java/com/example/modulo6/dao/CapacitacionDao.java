package com.example.modulo6.dao;

import com.example.modulo6.models.Capacitacion;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CapacitacionDao implements ICapacitacionDao {

    List<Capacitacion> capacitaciones;

    public CapacitacionDao(){
        capacitaciones = new ArrayList<>();
    }

    @Override
    public List<Capacitacion> obtenerCapacitaciones() {
        return capacitaciones;
    }

    @Override
    public void crearCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }
}
