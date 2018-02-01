package com.skcc.content.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import com.skcc.content.vo.Categories;

@Mapper
public interface CategoriesMapper {
	@Select("select * from categories order by id")
	public List<Categories> selectCategories();
	
	@Select("select * from categories where id=#{id}")
	public Categories selectCategoryById(String id);
	

}
