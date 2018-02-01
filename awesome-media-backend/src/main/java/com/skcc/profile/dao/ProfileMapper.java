package com.skcc.profile.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.skcc.profile.vo.Profile;


@Mapper
public interface ProfileMapper {
	

	@Select("select * from profiles where username=#{username}")
	public Profile selectProfileByusername(String username);
	
}
