package com.microservicios.microservicios.model;

import lombok.AllArgsConstructor;   
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Pelicula {
   
    private int id;
    private String titulo;
    private int anio;
    private String director;
    private String genero;
    private String sinopsis;
    
    public Pelicula(int id, String titulo, int anio, String director, String genero, String sinopsis) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.director = director;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }


}
