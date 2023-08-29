package com.example.modulo6.repository;

import com.example.modulo6.models.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContactoDao extends JpaRepository<Contacto,Integer> {
}
