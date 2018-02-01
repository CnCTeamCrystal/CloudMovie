package com.skcc.content.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Contents {
	private String id;
	private String category;
	private Double grade;
	private Boolean has_episodes;
	private String poster;
	private String rate;
	private String reg_date;
	private int runtime;
	private String stillcut;
	private String summary;
	private String title;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	private String video;
	private int view;
	private int year;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getGrade() {
		return grade;
	}
	public void setGrade(Double grade) {
		this.grade = grade;
	}
	public Boolean getHas_episodes() {
		return has_episodes;
	}
	public void setHas_episodes(Boolean has_episodes) {
		this.has_episodes = has_episodes;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	public String getStillcut() {
		return stillcut;
	}
	public void setStillcut(String stillcut) {
		this.stillcut = stillcut;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Contents [id=" + id + ", category=" + category + ", grade=" + grade + ", has_episodes=" + has_episodes
				+ ", poster=" + poster + ", rate=" + rate + ", reg_date=" + reg_date + ", runtime=" + runtime
				+ ", stillcut=" + stillcut + ", summary=" + summary + ", title=" + title + ", video=" + video
				+ ", view=" + view + ", year=" + year + "]";
	}

	
}
