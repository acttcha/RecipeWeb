package com.cha.recipe.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;
    private String name;
}
