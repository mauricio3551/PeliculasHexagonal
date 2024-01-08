package com.alkemy.peliculas.domain.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "GENERO")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "IMAGEN")
    private String imagen;

    @OneToMany()
    private Set<Movie> movies;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Set<Movie> getPeliculas() {
        return movies;
    }

    public void setPeliculas(Set<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) && Objects.equals(nombre, category.nombre) && Objects.equals(imagen, category.imagen) && Objects.equals(movies, category.movies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, imagen, movies);
    }
}
