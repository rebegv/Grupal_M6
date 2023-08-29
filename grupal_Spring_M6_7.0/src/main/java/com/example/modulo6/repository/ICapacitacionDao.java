package com.example.modulo6.repository;

import com.example.modulo6.models.Capacitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICapacitacionDao extends JpaRepository<Capacitacion,Integer> {

}
