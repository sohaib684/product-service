package com.productservice.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity @Table(name ="category")
    @Data @NoArgsConstructor
  @AllArgsConstructor
    public class Category {
      @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Integer id;

      @Column(name= "name" , length = 45)
      private String name;

      @OneToMany(mappedBy ="category" , cascade = CascadeType.ALL)
      private List<SubCategory> subCategories;
  }
