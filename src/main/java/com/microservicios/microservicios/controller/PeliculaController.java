package com.microservicios.microservicios.controller;

import org.springframework.web.bind.annotation.*;

import com.microservicios.microservicios.model.Pelicula;
import com.microservicios.microservicios.service.PeliculaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {   

    private final PeliculaService peliculaService;

    public PeliculaController(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }

   
    @GetMapping
    public List<Pelicula> todasPeliculas() {
        return peliculaService.todasPeliculas();
    }

    @GetMapping("/{id}")
    public Optional<Pelicula> peliculaPorId(@PathVariable int id) {
        return peliculaService.peliculaPorId(id);
    }
}
