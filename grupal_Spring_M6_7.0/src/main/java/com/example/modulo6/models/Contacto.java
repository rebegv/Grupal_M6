package com.example.modulo6.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contactos")
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contacto_id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "correo")
    private String correo;

    @Column(name = "comentario")
    private String comentario;

    public Contacto(String nombre, String correo, String comentario) {
        this.nombre = nombre;
        this.correo = correo;
        this.comentario = comentario;
    }
}
