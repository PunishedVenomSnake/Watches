package com.niit.backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.backend.dao.CategoryDAO;
import com.niit.backend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		
		// adding categories
		category.setId(1);
		category.setName("TV");
		category.setDescription("This is a description");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		category = new Category();
		
		// adding categories
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is a description");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		category = new Category();
		
		// adding categories
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is a description");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}
	@Override
	public Category get(int id) {
		// enhance for loop
		for(Category category : categories) {
			if(category.getId()==id) return category;
		}
		
		return null;
	}

}
