package com.example.modulo6.dao;

import com.example.modulo6.models.Capacitacion;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICapacitacionDao {

    public List<Capacitacion> obtenerCapacitaciones();

    public void crearCapacitacion(Capacitacion capacitacion);
}
