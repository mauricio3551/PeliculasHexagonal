package com.alkemy.peliculas.domain.repository;

import com.alkemy.peliculas.domain.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository<Movie, Long> {
}
