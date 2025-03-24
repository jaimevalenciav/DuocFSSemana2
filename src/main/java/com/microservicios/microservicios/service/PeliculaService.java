package com.microservicios.microservicios.service;
import org.springframework.stereotype.Service;

import com.microservicios.microservicios.model.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class PeliculaService {
    private final List<Pelicula>  peliculas = new ArrayList<>();

    public PeliculaService() {
        peliculas.add(new Pelicula(1, "Interestellar", 2014, "Christopher Nolan", "Ciencia Ficción", "Exploración del espacio y el tiempo."));
        peliculas.add(new Pelicula(2, "Inception", 2010, "Christopher Nolan", "Ciencia Ficción", "Un ladrón con la habilidad de entrar en los sueños de otros."));
        peliculas.add(new Pelicula(3, "El Padrino", 1972, "Francis Ford Coppola", "Crimen", "Historia de la familia Corleone y el mundo de la mafia."));
        peliculas.add(new Pelicula(4, "Pulp Fiction", 1994, "Quentin Tarantino", "Crimen", "Historias entrelazadas de criminales en Los Ángeles."));
        peliculas.add(new Pelicula(5, "Forrest Gump", 1994, "Robert Zemeckis", "Drama", "La vida de un hombre con un coeficiente intelectual bajo y su impacto en la historia."));
        peliculas.add(new Pelicula(6, "Matrix", 1999, "Lana y Lilly Wachowski", "Ciencia Ficción", "Un hacker descubre la verdadera naturaleza de su realidad."));
        peliculas.add(new Pelicula(7, "Gladiador", 2000, "Ridley Scott", "Acción", "Un general romano traicionado busca venganza en la arena."));
        peliculas.add(new Pelicula(8, "Titanic", 1997, "James Cameron", "Drama", "Una historia de amor en el fatídico viaje del Titanic."));
        peliculas.add(new Pelicula(9, "El Señor de los Anillos: El Retorno del Rey", 2003, "Peter Jackson", "Fantasía", "El desenlace épico de la lucha por la Tierra Media."));
        peliculas.add(new Pelicula(10, "Joker", 2019, "Todd Phillips", "Drama", "La transformación de Arthur Fleck en el icónico villano de Gotham."));
        peliculas.add(new Pelicula(11, "Los Vengadores", 2012, "Joss Whedon", "Acción", "Un grupo de superhéroes se une para salvar el mundo."));
        peliculas.add(new Pelicula(12, "Toy Story", 1995, "John Lasseter", "Animación", "Las aventuras de Woody y Buzz Lightyear en el mundo de los juguetes."));
        peliculas.add(new Pelicula(13, "Avatar", 2009, "James Cameron", "Ciencia Ficción", "Un exmarine se involucra con los nativos de Pandora."));
        peliculas.add(new Pelicula(14, "El Rey León", 1994, "Roger Allers, Rob Minkoff", "Animación", "La historia de Simba y su camino a convertirse en rey."));
        peliculas.add(new Pelicula(15, "Harry Potter y la Piedra Filosofal", 2001, "Chris Columbus", "Fantasía", "El inicio de las aventuras del joven mago Harry Potter."));
        peliculas.add(new Pelicula(16, "El Exorcista", 1973, "William Friedkin", "Terror", "Una niña es poseída por un demonio y un sacerdote intenta salvarla."));
        peliculas.add(new Pelicula(17, "El Viaje de Chihiro", 2001, "Hayao Miyazaki", "Animación", "Una niña entra en un mundo mágico y debe encontrar el camino de regreso."));
        peliculas.add(new Pelicula(18, "Parásitos", 2019, "Bong Joon-ho", "Drama", "Una familia pobre se infiltra en la vida de una familia adinerada."));
        peliculas.add(new Pelicula(19, "It", 2017, "Andy Muschietti", "Terror", "Un grupo de niños enfrenta a un aterrador payaso llamado Pennywise."));
        peliculas.add(new Pelicula(20, "Rápidos y Furiosos", 2001, "Rob Cohen", "Acción", "Carreras ilegales y robos a alta velocidad en Los Ángeles."));
    }

    public List <Pelicula> todasPeliculas(){
        return peliculas;
    }

    
    public Optional<Pelicula> peliculaPorId(int id) {
        return peliculas.stream()
            .filter(p -> p.getId() == id) 
            .findFirst();
    }
    
    
    
}
    


