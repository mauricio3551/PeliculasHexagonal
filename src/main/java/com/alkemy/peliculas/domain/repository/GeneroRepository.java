package com.alkemy.peliculas.domain.repository;

import com.alkemy.peliculas.domain.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<Category, Long> {

}
