package com.alkemy.peliculas.infrastructure.in.controller;

import com.alkemy.peliculas.infrastructure.in.controller.interfaces.CategoryController;
import com.alkemy.peliculas.infrastructure.in.dto.request.category.RequestCreateCategory;
import com.alkemy.peliculas.infrastructure.out.dto.response.category.ResponseCreateCategory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CategoryControllerImpl implements CategoryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CategoryControllerImpl.class);

    @Autowired
    public CategoryControllerImpl() {
    }

    @Override
    public ResponseCreateCategory createCategory(RequestCreateCategory request) {
        return null;
    }

}
