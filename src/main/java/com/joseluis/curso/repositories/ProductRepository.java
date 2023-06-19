package com.joseluis.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseluis.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
