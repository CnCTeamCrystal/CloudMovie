package com.skcc.promotion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skcc.promotion.dao.PromotionMapper;
import com.skcc.promotion.vo.Promotion;

@Service
public class PromotionService {

	private PromotionMapper promotionMapper;

	public PromotionService(PromotionMapper promotionMapper) {
		this.promotionMapper = promotionMapper;
	}

	public List<Promotion> getPromotions() {
		return promotionMapper.selectPromotions();
	}


}
