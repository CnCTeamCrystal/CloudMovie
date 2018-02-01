package com.skcc.content.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skcc.content.service.CategoryService;
import com.skcc.content.vo.Categories;

@RestController
public class CategoryRestController {
	private CategoryService categoryservice;
	
	public CategoryRestController(CategoryService categoryservice) {
		this.categoryservice = categoryservice;
	}
	@RequestMapping(path="/v1/categories", method=RequestMethod.GET)
	public List<Categories> getContent(){
		return categoryservice.getCategory();
	}
	//상세조회
	@GetMapping(path="/v1/categories/{id}")
	public Categories getCategoryById(@PathVariable(name="id") String id) {
		return categoryservice.getCategoryById(id);
	}
}
