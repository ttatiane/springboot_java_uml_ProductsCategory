package com.org.springboot.productsCategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.org.springboot.productsCategory.domain.Category;
import com.org.springboot.productsCategory.domain.Product;
import com.org.springboot.productsCategory.repositories.CategoryRepository;
import com.org.springboot.productsCategory.repositories.ProductRepository;

@SpringBootApplication
public class ProductsCategoryApplication implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProductsCategoryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//instanciando e salvando objetos da Entidade Category
		Category cat1 = new Category(1L, "Eletronics");
		Category cat2 = new Category(2L, "Books");
		
		categoryRepository.salvar(cat1);
		categoryRepository.salvar(cat2);
		
		//instanciando e salvando objetos da Entidade Product
		Product p1 = new Product(1L, "TV", 2200.00);
		Product p2 = new Product(2L, "Domain Driven Design", 120.00);
		Product p3 = new Product(3L, "PS5", 2800.00);
		Product p4 = new Product(4L, "Docker", 100.00);
		
		productRepository.salvar(p1);
		productRepository.salvar(p2);
		productRepository.salvar(p3);
		productRepository.salvar(p4);
		
	}

}
