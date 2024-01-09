package com.alkemy.peliculas.infrastructure.in.controller;

import com.alkemy.peliculas.infrastructure.in.controller.interfaces.MovieController;
import com.alkemy.peliculas.infrastructure.in.dto.request.movie.RequestCreateMovie;
import com.alkemy.peliculas.infrastructure.in.dto.request.movie.RequestDeleteMovie;
import com.alkemy.peliculas.infrastructure.in.dto.request.movie.RequestGetMovie;
import com.alkemy.peliculas.infrastructure.in.dto.request.movie.RequestPutMovie;
import com.alkemy.peliculas.infrastructure.out.dto.response.movie.ResponseCreateMovie;
import com.alkemy.peliculas.infrastructure.out.dto.response.movie.ResponseDeleteMovie;
import com.alkemy.peliculas.infrastructure.out.dto.response.movie.ResponseGetMovie;
import com.alkemy.peliculas.infrastructure.out.dto.response.movie.ResponsePutMovie;

public class MovieControllerImpl implements MovieController {
    @Override
    public ResponseGetMovie getMovie(RequestGetMovie request) {
        return null;
    }

    @Override
    public ResponseCreateMovie createMovie(RequestCreateMovie request) {
        return null;
    }

    @Override
    public ResponsePutMovie putMovie(RequestPutMovie request) {
        return null;
    }

    @Override
    public ResponseDeleteMovie deleteMovie(RequestDeleteMovie request) {
        return null;
    }
}
