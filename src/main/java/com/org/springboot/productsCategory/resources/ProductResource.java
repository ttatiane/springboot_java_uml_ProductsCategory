package com.org.springboot.productsCategory.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.springboot.productsCategory.domain.Product;
import com.org.springboot.productsCategory.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public ResponseEntity<List<Product>> buscarTodos() {
		List<Product> listProducts = productRepository.findAll();
		return ResponseEntity.ok().body(listProducts);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> buscarPorId(@PathVariable Long id) {
		Product prod = productRepository.findById(id).get();
		return ResponseEntity.ok().body(prod);
	}
	
}
