package com.example.modulo6.controllerRest;

import com.example.modulo6.utils.TipoUsuario;
import com.example.modulo6.models.Usuario;
import com.example.modulo6.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios/{tipo}")
    public ResponseEntity<List<Usuario>> getUsuariosPorTipo(@PathVariable("tipo") String tipo){
        TipoUsuario tipoUsuario = TipoUsuario.valueOf(tipo);
        return new ResponseEntity<>(usuarioService.obtenerUsuarioPorTipo(tipoUsuario), HttpStatus.OK);
    }

}
