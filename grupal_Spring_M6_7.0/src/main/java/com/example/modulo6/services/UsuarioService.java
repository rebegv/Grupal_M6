package com.example.modulo6.services;

import com.example.modulo6.utils.TipoUsuario;
import com.example.modulo6.models.Usuario;
import com.example.modulo6.repository.IUsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UsuarioService {
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

    public List<Usuario> obtenerUsuarioPorTipo(TipoUsuario tipoUsuario){
        List<Usuario> usuariosPorTipo = new ArrayList<>();

        try{
            usuariosPorTipo = iUsuarioDao.findAllByTipo(tipoUsuario);

        }catch (Exception e){
            e.printStackTrace();
        }


        return usuariosPorTipo;
    }

    public Usuario obtenerUsuarioPorNombre(String nombre){
        Usuario usuario = new Usuario();

        try{
            usuario = iUsuarioDao.findByNombre(nombre);
        }catch (Exception e){
            e.printStackTrace();
        }

        return usuario;
    }
}
