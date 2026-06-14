package com.productservice.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name =  "brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private BigDecimal price;
}
