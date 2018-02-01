package com.skcc.promotion.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.skcc.promotion.vo.Promotion;

@Mapper
public interface PromotionMapper {
	@Select("select * from promotions where category='tv'")
	public List<Promotion> selectPromotions();
}
