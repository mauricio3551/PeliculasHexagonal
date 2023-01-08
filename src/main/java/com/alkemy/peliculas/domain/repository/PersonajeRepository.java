package com.alkemy.peliculas.domain.repository;

import com.alkemy.peliculas.domain.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Long> {

}
