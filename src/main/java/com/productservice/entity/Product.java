package com.productservice.entity;

import jakarta.persistence.*;

@Entity
    @Table(name = "products")
    public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "sub_category_id")
    private SubCategory subCategory;
}

