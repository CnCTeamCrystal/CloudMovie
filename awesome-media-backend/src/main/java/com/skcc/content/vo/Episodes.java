package com.skcc.content.vo;

public class Episodes {
	private String content;
	private int episode;
	private int season;
	private String poster;
	private String reg_data;
	private int runtime;
	private String summary;
	private String title;
	private String video;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getEpisode() {
		return episode;
	}
	public void setEpisode(int episode) {
		this.episode = episode;
	}
	public int getSeason() {
		return season;
	}
	public void setSeason(int season) {
		this.season = season;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getReg_data() {
		return reg_data;
	}
	public void setReg_data(String reg_data) {
		this.reg_data = reg_data;
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	@Override
	public String toString() {
		return "Episodes [content=" + content + ", episode=" + episode + ", season=" + season + ", poster=" + poster
				+ ", reg_data=" + reg_data + ", runtime=" + runtime + ", summary=" + summary + ", title=" + title
				+ ", video=" + video + "]";
	}
	
	
}

