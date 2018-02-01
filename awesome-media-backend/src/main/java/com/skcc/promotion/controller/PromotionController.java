package com.skcc.promotion.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skcc.promotion.service.PromotionService;
import com.skcc.promotion.vo.Promotion;

@RestController
public class PromotionController {
	
	private PromotionService promotionService;
	
	@RequestMapping(path="/v1/promotions", method=RequestMethod.GET)
	public List<Promotion> getPromotions() {
		return promotionService.getPromotions();
	}

}
