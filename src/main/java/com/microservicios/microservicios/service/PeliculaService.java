package com.microservicios.microservicios.service;

import com.microservicios.microservicios.model.Pelicula;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;


@Service
public class PeliculaService {
    private final List<Pelicula> peliculas = new ArrayList<>();

    public PeliculaService() {
        peliculas.add(new Pelicula(1L, "Blade Runner 2049", 2017, "Denis Villeneuve", "Ciencia Ficción", "Un oficial de policía descubre un secreto que podría cambiar el destino de la humanidad."));
        peliculas.add(new Pelicula(2L, "La La Land", 2016, "Damien Chazelle", "Musical", "Un pianista de jazz y una actriz persiguen sus sueños en Los Ángeles."));
        peliculas.add(new Pelicula(3L, "Whiplash", 2014, "Damien Chazelle", "Drama", "Un joven baterista lucha contra un exigente instructor de música."));
        peliculas.add(new Pelicula(4L, "El Cisne Negro", 2010, "Darren Aronofsky", "Thriller", "Una bailarina de ballet enfrenta la presión de su papel estelar."));
        peliculas.add(new Pelicula(5L, "Mad Max: Furia en el Camino", 2015, "George Miller", "Acción", "En un mundo postapocalíptico, un grupo huye del tirano Immortan Joe."));
        peliculas.add(new Pelicula(6L, "El Laberinto del Fauno", 2006, "Guillermo del Toro", "Fantasía", "Una niña descubre un mundo mágico en la España franquista."));
        peliculas.add(new Pelicula(7L, "Parásitos", 2019, "Bong Joon-ho", "Drama", "Una familia pobre se infiltra en la vida de una familia rica."));
        peliculas.add(new Pelicula(8L, "Amelie", 2001, "Jean-Pierre Jeunet", "Comedia", "Una joven parisina decide mejorar la vida de quienes la rodean."));
        peliculas.add(new Pelicula(9L, "El Castillo Ambulante", 2004, "Hayao Miyazaki", "Animación", "Una joven hechizada se aventura en el castillo de un mago errante."));
        peliculas.add(new Pelicula(10L, "Ratatouille", 2007, "Brad Bird", "Animación", "Una rata con talento culinario busca convertirse en chef en París."));
        peliculas.add(new Pelicula(11L, "La Lista de Schindler", 1993, "Steven Spielberg", "Drama", "Un empresario alemán salva a cientos de judíos durante el Holocausto."));
        peliculas.add(new Pelicula(12L, "No Country for Old Men", 2007, "Hermanos Coen", "Thriller", "Un hombre encuentra un maletín con dinero y es perseguido por un asesino."));
        peliculas.add(new Pelicula(13L, "El Gran Lebowski", 1998, "Hermanos Coen", "Comedia", "Un hombre apodado 'The Dude' se ve envuelto en un enredo criminal."));
        peliculas.add(new Pelicula(14L, "Interiores", 1978, "Woody Allen", "Drama", "La crisis de una familia tras la separación de los padres."));
        peliculas.add(new Pelicula(15L, "El Irlandés", 2019, "Martin Scorsese", "Crimen", "Un asesino a sueldo recuerda su vida en la mafia."));
        peliculas.add(new Pelicula(16L, "Casino", 1995, "Martin Scorsese", "Crimen", "La historia de la mafia en Las Vegas."));
        peliculas.add(new Pelicula(17L, "Los Infiltrados", 2006, "Martin Scorsese", "Thriller", "Un policía encubierto y un informante de la mafia en Boston."));
        peliculas.add(new Pelicula(18L, "Scarface", 1983, "Brian De Palma", "Crimen", "La brutal ascensión de un inmigrante cubano en el mundo del narcotráfico."));
        peliculas.add(new Pelicula(19L, "Oldboy", 2003, "Park Chan-wook", "Thriller", "Un hombre busca venganza tras haber sido encarcelado por 15 años sin razón."));
        peliculas.add(new Pelicula(20L, "The Social Network", 2010, "David Fincher", "Drama", "La historia de la creación de Facebook y sus conflictos legales."));
    }
    

    public List<Pelicula> obtenerTodas(){
        return peliculas;
    }

    public Optional<Pelicula> obtenerPorId(Long id){
        return peliculas.stream()
        .filter(p->p.getId().equals(id))
        .findFirst();
    }
}
