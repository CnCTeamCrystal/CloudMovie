package com.skcc.content.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.skcc.content.dao.CategoriesMapper;
import com.skcc.content.vo.Categories;

@Service
public class CategoryService {
	private CategoriesMapper categoriesMapper;
	
	public CategoryService(CategoriesMapper categoriesMapper){
		this.categoriesMapper = categoriesMapper;
	}
	
	public List<Categories> getCategory(){
		return categoriesMapper.selectCategories();
	}
	
	public Categories getCategoryById(String id){
		return categoriesMapper.selectCategoryById(id);
	}
}
