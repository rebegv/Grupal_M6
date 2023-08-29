package com.example.modulo6.repository;

import com.example.modulo6.utils.TipoUsuario;
import com.example.modulo6.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUsuarioDao extends JpaRepository<Usuario,Integer> {

    List<Usuario> findAllByTipo(TipoUsuario tipoUsuario);
    Usuario findByNombre(String nombre);
}
