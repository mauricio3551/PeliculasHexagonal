package com.alkemy.peliculas.domain.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "PELICULA")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "IMAGEN")
    private String imagen;

    @Column(name = "TITULO", nullable = false)
    private String titulo;

    @Column(name = "FECHA_DE_CREACION", nullable = false)
    private LocalDate fechaDeCreacion;

    @Column(name = "CALIFICACION", nullable = false)
    private Long calificacion;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.DETACH})
    private Set<Character> characters;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Long getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Long calificacion) {
        this.calificacion = calificacion;
    }

    public Set<Character> getPersonajes() {
        return characters;
    }

    public void setPersonajes(Set<Character> characters) {
        this.characters = characters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(id, movie.id) && Objects.equals(imagen, movie.imagen) && Objects.equals(titulo, movie.titulo) && Objects.equals(fechaDeCreacion, movie.fechaDeCreacion) && Objects.equals(calificacion, movie.calificacion) && Objects.equals(characters, movie.characters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imagen, titulo, fechaDeCreacion, calificacion, characters);
    }
}
