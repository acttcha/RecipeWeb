package com.cha.recipe.controller;

import com.cha.recipe.entity.Ingredient;
import com.cha.recipe.entity.Recipe;
import com.cha.recipe.entity.Step;
import com.cha.recipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller // 스프링이 컨트롤러라는 것을 인지
public class WebController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/")
    //@ResponseBody 어노테이션을 사용하면 return값을 브라우저에 출력 / ResponseBody 어노테이션이 없으면 return에서 반환하는 문자열은 뷰 이름이 됨.
    public String main(){
        return "index.html";
    }
    @GetMapping("/recipe/write")
    public String recipeWriteForm(){
        return "recipewrite";
    }
    @PostMapping("/recipe/writepro")
    //public String recipeWritePro(String title, String content, @RequestParam("ingredients[]") List<String> ingredients, @RequestParam("steps[]") List<String> steps){
    public String recipeWritePro(Recipe recipe){

        return "";
    }





}

