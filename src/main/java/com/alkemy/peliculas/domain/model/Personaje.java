package com.alkemy.peliculas.domain.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "PERSONAJE")
public class Personaje {

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
    private Set<Pelicula> peliculas;

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

    public Set<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Set<Pelicula> peliculas) {
        this.peliculas = peliculas;
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
        Personaje personaje = (Personaje) o;
        return Objects.equals(id, personaje.id) && Objects.equals(edad, personaje.edad) && Objects.equals(peso, personaje.peso) && Objects.equals(imagen, personaje.imagen) && Objects.equals(historia, personaje.historia) && Objects.equals(peliculas, personaje.peliculas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, edad, peso, imagen, historia, peliculas);
    }
}
