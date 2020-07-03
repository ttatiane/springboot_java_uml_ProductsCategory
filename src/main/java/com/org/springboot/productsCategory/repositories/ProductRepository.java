package com.org.springboot.productsCategory.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.org.springboot.productsCategory.domain.Product;

@Component
public class ProductRepository {
	
	Map<Long, Product> mapProduct = new HashMap<>();
	
	public void salvar(Product obj) {
		mapProduct.put(obj.getId(), obj);
	}
	
	public Product buscarPorId(Long id) {
		return mapProduct.get(id);
	}
	
	public List<Product> buscarPorTodos() {
		return new ArrayList<Product>(mapProduct.values());
	}

}
