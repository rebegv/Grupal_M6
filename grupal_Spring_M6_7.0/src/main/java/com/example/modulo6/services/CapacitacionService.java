package com.example.modulo6.services;

import com.example.modulo6.models.Capacitacion;
import com.example.modulo6.repository.ICapacitacionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CapacitacionService {


    @Autowired
    private ICapacitacionDao iCapacitacionDao;

    public void guardarCapacitacion(Capacitacion capacitacion){
        try{
            if(!capacitacion.equals("") || capacitacion != null){
                iCapacitacionDao.save(capacitacion);
                    System.out.println("\nrut cliente: "+capacitacion.getRutCliente());
                    System.out.println("dia: "+capacitacion.getDia());
                    System.out.println("hora: "+capacitacion.getHora());
                    System.out.println("lugar: "+capacitacion.getLugar());
                    System.out.println("duracion: "+capacitacion.getDuracion());
                    System.out.println("cantidad asistentes: "+capacitacion.getCantAsistentes()+"\n");
            }else{
                System.out.println("No se ha podido guardar la capacitacion");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<Capacitacion> obtenerCapacitaciones(){
        List<Capacitacion> capacitaciones = new ArrayList<>();

        try {
            capacitaciones = iCapacitacionDao.findAll();

        }catch (Exception e){
            e.printStackTrace();
        }

        return capacitaciones;
    }



}
