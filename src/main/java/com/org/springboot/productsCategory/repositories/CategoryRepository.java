package com.org.springboot.productsCategory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.springboot.productsCategory.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
