package com.microservicios.microservicios.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.microservicios.microservicios.model.Pelicula;
import com.microservicios.microservicios.service.PeliculaService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/peliculas")

public class PeliculaController {
    private final PeliculaService peliculaService;

    public PeliculaController(PeliculaService peliculaService){
        this.peliculaService = peliculaService;
    }

    @GetMapping
    public List<Pelicula> obtenerTodas(){
        return peliculaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Pelicula peliculaPorId(@PathVariable Long id) {
    return peliculaService.obtenerPorId(id)
        .orElseThrow(() -> new ResponseStatusException(
            HttpStatus.NOT_FOUND, 
            "La película con el ID " + id + " no se encuentra en la base de datos."
        ));
    }
    
    
}
