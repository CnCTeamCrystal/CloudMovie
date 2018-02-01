package com.skcc.content.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skcc.content.dao.ContentsMapper;
import com.skcc.content.dao.EpisodesMapper;
import com.skcc.content.vo.Categories;
import com.skcc.content.vo.Contents;
import com.skcc.content.vo.Episodes;

@Service
public class EpisodeService {

	private EpisodesMapper episodesMapper;
	public EpisodeService(EpisodesMapper episodesMapper){
		this.episodesMapper = episodesMapper;
	}
	public List<Episodes> selectEpisodeByContent(String content){
		return episodesMapper.selectEpisodeByContent(content);
	}
}
