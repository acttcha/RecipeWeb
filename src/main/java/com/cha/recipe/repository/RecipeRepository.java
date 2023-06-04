package com.cha.recipe.repository;

import com.cha.recipe.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
    //검색기능
    List<Recipe> findByTitleContainingIgnoreCase(String keyword);
}
