package com.cha.recipe.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data

public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String content;
    private String mainImageUrl;

    @OneToMany(mappedBy = "recipe")
    private List<Ingredient> ingredients;

    @OneToMany(mappedBy = "recipe")
    private List<Step> steps;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public List<Step> getSteps() {
        return steps;
    }

}
