package com.joseluis.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joseluis.curso.entities.Product;
import com.joseluis.curso.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product>findAll(){
		return repository.findAll();	
	}
	
	public Product findById (Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
		
	}
}
