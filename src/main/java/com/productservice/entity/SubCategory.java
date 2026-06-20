package com.productservice.entity;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
    @Table(name ="sub_category")
public class SubCategory {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToOne @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "subCategory", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Product> products = new LinkedHashSet<>();

}
