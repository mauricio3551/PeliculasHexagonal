package com.alkemy.peliculas.infrastructure.in.controller.interfaces;

import com.alkemy.peliculas.infrastructure.in.controller.shared.ControllerPattern;
import com.alkemy.peliculas.infrastructure.in.dto.request.category.RequestCreateCategory;
import com.alkemy.peliculas.infrastructure.out.dto.response.category.ResponseCreateCategory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(ControllerPattern.ALKEMY_CATEGORY_ENDPOINT)
public interface CategoryController {

    @PostMapping(ControllerPattern.CREATE_ENDPOINT)
    ResponseCreateCategory createCategory(RequestCreateCategory request);

}
