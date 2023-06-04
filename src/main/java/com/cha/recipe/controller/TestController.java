package com.cha.recipe.controller;

import com.cha.recipe.entity.Recipe;
import com.cha.recipe.repository.RecipeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    private final RecipeRepository recipeRepository;

    public TestController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @GetMapping("/test")
    public String test() {
        List<Recipe> recipes = recipeRepository.findAll();
        return "DB 연결 상태 확인: 총 " + recipes.size() + "개의 레시피가 있습니다.";
    }
}