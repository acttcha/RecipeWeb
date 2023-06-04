package com.cha.recipe.repository;

import com.cha.recipe.entity.Step;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StepRepository extends JpaRepository<Step, Integer> {
}