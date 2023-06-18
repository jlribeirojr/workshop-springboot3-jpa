package com.joseluis.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseluis.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
