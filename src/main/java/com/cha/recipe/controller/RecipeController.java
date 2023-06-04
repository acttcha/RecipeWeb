package com.cha.recipe.controller;

import com.cha.recipe.entity.Recipe;
import com.cha.recipe.repository.RecipeRepository;
import com.cha.recipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class RecipeController {

    @Autowired
    private RecipeService recipeService;
    private final RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @GetMapping("/recipe/{id}")
    public String viewRecipe(@PathVariable("id") int id, Model model) {
        Optional<Recipe> recipeOptional = recipeRepository.findById(id);
        if (recipeOptional.isPresent()) {
            Recipe recipe = recipeOptional.get();
            model.addAttribute("recipe", recipe);
            return "recipe";
        } else {
            return "error"; // Handle error case
        }
    }

    @GetMapping("/recipe/list")
    public String RecipeList(@RequestParam(defaultValue = "0") int page, Model model){
        int pageSize = 18; // 페이지당 보여줄 레시피 수
        List<Recipe> recipes = recipeService.recipeList(page, pageSize);
        int totalPages = recipeService.getTotalPages(pageSize);

        model.addAttribute("recipes", recipes);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("currentPage", page);

        return "recipelist";
    }

    //검색기능
    @GetMapping("/recipe/search")
    public String searchRecipes(@RequestParam("keyword") String keyword, Model model) {
        RecipeService.SearchResult searchResult = recipeService.searchRecipes(keyword);
        List<Recipe> recipes = searchResult.getRecipes();
        int totalResults = searchResult.getTotalResults();
        String searchKeyword = searchResult.getKeyword();

        model.addAttribute("recipes", recipes);
        model.addAttribute("totalResults", totalResults);
        model.addAttribute("searchKeyword", searchKeyword);

        return "recipelist";
    }
}