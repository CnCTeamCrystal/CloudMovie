package com.skcc.content.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skcc.content.dao.CategoriesMapper;
import com.skcc.content.dao.ContentsMapper;
import com.skcc.content.vo.Categories;
import com.skcc.content.vo.Contents;
@Service
public class ContentService {
	private ContentsMapper contentsMapper;
	
	public ContentService(ContentsMapper contentsMapper){
		this.contentsMapper = contentsMapper;
	}
	
	public List<Contents> selectContentByCategory(String category){
		return contentsMapper.selectContentByCategory(category);
	}
	public List<Contents> selectContentByTitle(String title){
		return contentsMapper.selectContentByTitle(title);
	}
	
	public Contents selectContentById(String id) {
		return contentsMapper.selectContentById(id);
	}
}
