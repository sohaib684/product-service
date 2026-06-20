package com.productservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.productservice.dto.CategoryDto;
import com.productservice.entity.Category;
import com.productservice.mapper.CategoryMapper;
import com.productservice.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDto> findAll() {

        List<Category> categories = categoryRepository.findAll();
        List<CategoryDto> dtoList = new ArrayList<>();

        for (Category c : categories) {
            dtoList.add(CategoryMapper.convertCategoryToDto(c));
        }

        return dtoList;
    }

    @Override
    public CategoryDto findByCategoryId(long id) {
        return null;
    }

    @Override
    public CategoryDto findByCategoryName(String name) {
        return null;
    }
}