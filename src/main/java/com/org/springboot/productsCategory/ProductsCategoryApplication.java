package com.org.springboot.productsCategory;

import java.util.Arrays;

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
		Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Books");
		
		categoryRepository.salvar(cat1);
		categoryRepository.salvar(cat2);
		
		//instanciando e salvando objetos da Entidade Product
		Product p1 = new Product(null, "TV", 2200.00, cat1);
		Product p2 = new Product(null, "Domain Driven Design", 120.00, cat2);
		Product p3 = new Product(null, "PS5", 2800.00, cat1);
		Product p4 = new Product(null, "Docker", 100.00, cat2);
		
		cat1.getProducts().addAll(Arrays.asList(p1, p3));
		cat2.getProducts().addAll(Arrays.asList(p2, p4));
		
		productRepository.salvar(p1);
		productRepository.salvar(p2);
		productRepository.salvar(p3);
		productRepository.salvar(p4);
		
	}

}
