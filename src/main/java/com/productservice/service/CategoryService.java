package com.productservice.service;

import com.productservice.dto.CategoryDto;
import java.util.List;

public interface CategoryService {

    List<CategoryDto> findAll();

    CategoryDto findByCategoryId(long id);

    CategoryDto findByCategoryName(String name);
}