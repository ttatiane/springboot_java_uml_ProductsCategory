package com.org.springboot.productsCategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.org.springboot.productsCategory.domain.Category;
import com.org.springboot.productsCategory.repositories.CategoryRepository;

@SpringBootApplication
public class ProductsCategoryApplication implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProductsCategoryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L, "Eletronics");
		Category cat2 = new Category(2L, "Books");
		
		categoryRepository.salvar(cat1);
		categoryRepository.salvar(cat2);
		
	}

}
