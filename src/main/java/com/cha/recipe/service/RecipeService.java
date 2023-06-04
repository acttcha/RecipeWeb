package com.cha.recipe.service;

import com.cha.recipe.entity.Ingredient;
import com.cha.recipe.entity.Recipe;
import com.cha.recipe.entity.Step;
import com.cha.recipe.repository.IngredientRepository;
import com.cha.recipe.repository.RecipeRepository;
import com.cha.recipe.repository.StepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class RecipeService {
    @Autowired
    private RecipeRepository recipeRepository;

    public List<Recipe> recipeList(int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        Page<Recipe> recipePage = recipeRepository.findAll(pageable);
        return recipePage.getContent();
    }

    public int getTotalPages(int pageSize) {
        long totalRecipes = recipeRepository.count();
        return (int) Math.ceil((double) totalRecipes / pageSize);
    }

    //검색기능
    public SearchResult searchRecipes(String keyword) {
        List<Recipe> recipes = recipeRepository.findByTitleContainingIgnoreCase(keyword);
        int totalResults = recipes.size();
        return new SearchResult(recipes, totalResults, keyword);
    }

    public class SearchResult {
        private List<Recipe> recipes;
        private int totalResults;
        private String keyword;

        public SearchResult(List<Recipe> recipes, int totalResults, String keyword) {
            this.recipes = recipes;
            this.totalResults = totalResults;
            this.keyword = keyword;
        }

        public List<Recipe> getRecipes() {
            return recipes;
        }

        public int getTotalResults() {
            return totalResults;
        }

        public String getKeyword() {
            return keyword;
        }
    }

}