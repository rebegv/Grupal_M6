package com.example.modulo6.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Capacitacion {

    public int identificador;
    public String rutCliente;
    public String dia;
    public String hora;
    public String lugar;
    public String duracion;
    public int cantAsistentes;

}
