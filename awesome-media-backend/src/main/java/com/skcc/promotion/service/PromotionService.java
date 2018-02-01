package com.skcc.promotion.service;

import org.springframework.stereotype.Service;

import com.skcc.content.vo.Contents;
import com.skcc.promotion.dao.PromotionMapper;


@Service
public class PromotionService {

	private PromotionMapper promotionMapper;

	public PromotionService(PromotionMapper promotionMapper) {
		this.promotionMapper = promotionMapper;
	}

	public Contents getPromotionsByCategory() {
		return promotionMapper.selectPromotionsByCategory();
	}


}
