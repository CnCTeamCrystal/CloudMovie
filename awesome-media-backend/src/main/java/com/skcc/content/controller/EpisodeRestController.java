package com.skcc.content.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.skcc.content.service.EpisodeService;
import com.skcc.content.vo.Episodes;

@RestController
public class EpisodeRestController {
	private EpisodeService episodeservice;
	
	@GetMapping(path="/v1/contents/{content}/episodes")
	public List<Episodes> getEpisodeByContent(@PathVariable(name="content") String content) {
		
		List<Episodes> list = new ArrayList<Episodes>();
		List<Episodes> rst = new ArrayList<Episodes>();
		
		list = episodeservice.selectEpisodeByContent(content);
		int size = list.size();
		
		
		
		
		return list;
		
	}
}
