package com.example.modulo6.controllers;

import com.example.modulo6.models.Capacitacion;
import com.example.modulo6.models.TipoUsuario;
import com.example.modulo6.models.Usuario;
import com.example.modulo6.services.UsuarioDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
@Slf4j
public class UsuarioController {
    @Autowired
    private UsuarioDao usuarioDao;

    @GetMapping("/crearUsuario")
    public String mostrarFormularioUsuario(Model model){
        model.addAttribute("tipos",TipoUsuario.values());

        return "crearUsuarioView";
    }

    @PostMapping("/guardarUsuario")
    public String guardarUsuario(@RequestParam("nombre") String nombre,
                                 @RequestParam("contrasenia") String contrasenia,
                                 @RequestParam("tipo") String tipo){
        TipoUsuario tipoUsuario = TipoUsuario.valueOf(tipo);

        Usuario usuario = new Usuario(nombre,contrasenia,tipoUsuario);
        usuarioDao.guardarUsuario(usuario);
        log.info("usuario guardado");

        return "crearUsuarioView";
    }

    @GetMapping("/listarUsuarios")
    public String listarUsuarios(Model model){
        model.addAttribute("listaUsuarios", usuarioDao.obtenerUsuarios());
        return "listarUsuariosView";
    }
}
