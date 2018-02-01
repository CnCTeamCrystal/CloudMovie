package com.skcc.promotion.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.skcc.content.vo.Contents;

@Mapper
public interface PromotionMapper {
	@Select("select * from contents where id = (select content from promotions where category='tv')")
	public Contents selectPromotionsByCategory();
}
