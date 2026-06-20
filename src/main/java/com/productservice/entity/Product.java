package com.productservice.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
    @Table(name = "products")
    public class Product {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "sub_category_id")
    private SubCategory subCategory;
    @OneToMany(mappedBy = "product" , cascade = CascadeType.ALL ,orphanRemoval = true)
    private Set<Brand> brands = new LinkedHashSet<>();

    private Integer id;
    private String name;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Brand> brand = new LinkedHashSet<>();

    public Set<Brand> getBrand() {
        return brand;
    }

    public void setBrand(Set<Brand> brand) {
        this.brand = brand;
    }
}

