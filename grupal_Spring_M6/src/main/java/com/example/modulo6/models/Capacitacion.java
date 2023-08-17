package com.example.modulo6.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "capacitaciones")
public class Capacitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "capacitacion_id")
    public Integer identificador;

    @Column(name = "rut_cliente")
    public String rutCliente;

    @Column(name = "dia")
    public String dia;

    @Column(name = "hora")
    public String hora;

    @Column(name = "lugar")
    public String lugar;

    @Column(name = "duracion")
    public String duracion;

    @Column(name = "cant_asistentes")
    public Integer cantAsistentes;

    public Capacitacion(String rutCliente, String dia, String hora, String lugar, String duracion, Integer cantAsistentes) {
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantAsistentes = cantAsistentes;
    }
}
