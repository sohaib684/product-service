package com.productservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "size")
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String size;
    private String quantity;

    @ManyToOne
    @JoinColumn(name = "brands_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "brands_id")
    private Brand brands;


}

