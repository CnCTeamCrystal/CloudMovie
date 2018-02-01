package com.skcc.content.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.skcc.content.vo.Categories;
import com.skcc.content.vo.Contents;

@Mapper
public interface ContentsMapper {
	
	
	@Select("select * from contents where category=#{category}")
	public List<Contents> selectContentByCategory(String category);
	
	@Select("select * from contents where title=#{title}")
	public List<Contents> selectContentByTitle(String title);
	
	
	@Select("select * from contents where id=#{id}")
	public Contents selectContentById(String id);
	
	
}
