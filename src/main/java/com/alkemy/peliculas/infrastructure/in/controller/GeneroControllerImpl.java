package com.alkemy.peliculas.infrastructure.in.controller;

import com.alkemy.peliculas.infrastructure.in.controller.shared.ControllerPattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(ControllerPattern.ALKEMY_GENERO_ENDPOINT)
public class GeneroControllerImpl {

    private static final Logger LOGGER = LoggerFactory.getLogger(GeneroControllerImpl.class);

    @Autowired
    public GeneroControllerImpl() {
    }

    @PostMapping(ControllerPattern.CREAR_ENDPOINT)
    public ResponseEntity<?> postGenero(@Valid @RequestBody ?) {

    }
}
