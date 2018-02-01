package com.skcc.content.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.skcc.content.vo.Categories;
import com.skcc.content.vo.Contents;
import com.skcc.content.vo.Episodes;

@Mapper
public interface EpisodesMapper {

	@Select("select * from episodes where content=#{content}")
	public List<Episodes> selectEpisodeByContent(String content);
	
}
