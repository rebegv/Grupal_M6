package com.example.modulo6.services;

import com.example.modulo6.models.Capacitacion;
import com.example.modulo6.models.Usuario;
import com.example.modulo6.repository.IUsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UsuarioDao {
    @Autowired
    private IUsuarioDao iUsuarioDao;

    public void guardarUsuario(Usuario usuario){
        try{
            if(!usuario.equals("") || usuario != null){
                iUsuarioDao.save(usuario);
            }else{
                System.out.println("No se ha podido guardar el usuario");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<Usuario> obtenerUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();

        try {
            usuarios = iUsuarioDao.findAll();

        }catch (Exception e){
            e.printStackTrace();
        }

        return usuarios;
    }
}
