package com.tads.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name="categoria")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
