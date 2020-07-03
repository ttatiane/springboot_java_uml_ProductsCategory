package com.org.springboot.productsCategory.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.springboot.productsCategory.domain.Category;
import com.org.springboot.productsCategory.repositories.CategoryRepository;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping
	public ResponseEntity<List<Category>> buscarTodos() {
		List<Category> listCategories = categoryRepository.findAll();
		return ResponseEntity.ok().body(listCategories);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> buscarPorId(@PathVariable Long id) {
		Category cat = categoryRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
	

}
