package com.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productservice.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}