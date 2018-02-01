package com.skcc.promotion.vo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.skcc.content.vo.Categories;
import com.skcc.content.vo.Contents;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Promotion {

	public Categories category;

	public Contents content;

	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}

	public Contents getContent() {
		return content;
	}

	public void setContent(Contents content) {
		this.content = content;
	}

	@Override
	public String toString() {
		System.out.println(4);
		return "Promotion [category=" + category + ", content=" + content + "]";
	}

	

}
