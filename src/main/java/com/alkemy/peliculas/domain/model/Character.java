package com.alkemy.peliculas.domain.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "PERSONAJE")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "EDAD", nullable = false)
    private Integer edad;

    @Column(name = "PESO", nullable = false)
    private Integer peso;

    @Column(name = "IMAGEN")
    private String imagen;

    @Column(name = "HISTORIA", nullable = false)
    private String historia;

    @ManyToMany(mappedBy = "personajes")
    private Set<Movie> movies;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public Set<Movie> getPeliculas() {
        return movies;
    }

    public void setPeliculas(Set<Movie> movies) {
        this.movies = movies;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(id, character.id) && Objects.equals(edad, character.edad) && Objects.equals(peso, character.peso) && Objects.equals(imagen, character.imagen) && Objects.equals(historia, character.historia) && Objects.equals(movies, character.movies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, edad, peso, imagen, historia, movies);
    }
}
