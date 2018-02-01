package com.skcc.content.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skcc.content.service.ContentService;
import com.skcc.content.vo.Contents;

@RestController
public class ContentRestController {
	private ContentService contentservice;
	
	public ContentRestController(ContentService contentservice) {
		this.contentservice = contentservice;
	}
	@RequestMapping("/v1/contents")
	public List<Contents> selectContentByCategory(@RequestParam(name="category") String category) {
		return contentservice.selectContentByCategory(category);
	}
//	public Contents selectContentByCategory(@RequestParam("category") String category) {
//		return contentservice.selectContentByCategory(category);
//	}
	@RequestMapping("/v1/contents/search")
	public List<Contents> selectContentByTitle(@RequestParam(name="title") String title) {
		return contentservice.selectContentByTitle(title);
	}
	@GetMapping(path="/v1/contents/{id}")
	public Contents getContentById(@PathVariable(name="id") String id) {
		return contentservice.selectContentById(id);
	}
}
