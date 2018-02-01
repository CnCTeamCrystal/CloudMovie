package com.skcc.promotion.vo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Promotion {

	public String category;

	public int content;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getContent() {
		return content;
	}

	public void setContent(int content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Promotion [category=" + category + ", content=" + content + "]";
	}

	

}
