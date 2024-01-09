package com.alkemy.peliculas.infrastructure.in.controller.interfaces;

import com.alkemy.peliculas.infrastructure.in.controller.shared.ControllerPattern;
import com.alkemy.peliculas.infrastructure.in.dto.request.character.RequestGetCharacter;
import com.alkemy.peliculas.infrastructure.out.dto.response.character.ResponseGetCharacter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(ControllerPattern.ALKEMY_CHARACTER_ENDPOINT)
public interface CharacterController {

    @GetMapping(ControllerPattern.GET_ENDPOINT)
    ResponseGetCharacter getCharacter(RequestGetCharacter request);

}
