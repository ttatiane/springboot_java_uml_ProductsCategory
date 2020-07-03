package com.org.springboot.productsCategory.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.org.springboot.productsCategory.domain.Category;

@Component
public class CategoryRepository {
	
	private Map<Long, Category> mapCategory = new HashMap<>(); 

	public void salvar(Category obj) {
		mapCategory.put(obj.getId(), obj);
	}
	
	public Category buscarPorId(long id) { 
		return mapCategory.get(id);
	}
	
	public List<Category> buscarTodos() { 
		return new ArrayList<Category>(mapCategory.values());
	}
	
}
