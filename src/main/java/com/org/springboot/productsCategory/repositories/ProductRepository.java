package com.org.springboot.productsCategory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.springboot.productsCategory.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
