package com.alkemy.peliculas.infrastructure.in.controller.interfaces;

import com.alkemy.peliculas.infrastructure.in.controller.shared.ControllerPattern;
import com.alkemy.peliculas.infrastructure.in.dto.request.movie.RequestCreateMovie;
import com.alkemy.peliculas.infrastructure.in.dto.request.movie.RequestDeleteMovie;
import com.alkemy.peliculas.infrastructure.in.dto.request.movie.RequestPutMovie;
import com.alkemy.peliculas.infrastructure.out.dto.response.movie.ResponseCreateMovie;
import com.alkemy.peliculas.infrastructure.out.dto.response.movie.ResponseDeleteMovie;
import com.alkemy.peliculas.infrastructure.out.dto.response.movie.ResponsePutMovie;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(ControllerPattern.ALKEMY_MOVIE_ENDPOINT)
public interface MovieController {

    @PostMapping(ControllerPattern.CREATE_ENDPOINT)
    ResponseCreateMovie createMovie(RequestCreateMovie request);

    @PutMapping(ControllerPattern.PUT_ENDPOINT)
    ResponsePutMovie putMovie(RequestPutMovie request);

    @DeleteMapping(ControllerPattern.DELETE_ENDPOINT)
    ResponseDeleteMovie deleteMovie(RequestDeleteMovie request);
}
