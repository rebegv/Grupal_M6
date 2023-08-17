package com.example.modulo6.services;

import com.example.modulo6.models.Contacto;
import com.example.modulo6.repository.IContactoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoDao {

    @Autowired
    IContactoDao iContactoDao;

    public void guardarContacto(Contacto contacto){
        try{
            if(!contacto.equals("") || contacto != null){
                iContactoDao.save(contacto);
                System.out.println("\nNombre: "+contacto.getNombre()+
                                   "\nCorreo: "+contacto.getCorreo()+
                                   "\nComentario: "+contacto.getComentario());
            }else{
                System.out.println("No se ha podido guardar el contacto");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
