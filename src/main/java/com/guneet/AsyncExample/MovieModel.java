package com.guneet.AsyncExample;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MovieModel {
	private String title;
	private String orignal_title;
	private String description;
	private String director;
	private String producer;
	private int release_year;
	private int running_time;
	private int rt_score;
	public String getTitle() {
		return title;
	}
	public String getOrignal_title() {
		return orignal_title;
	}
	public String getDescription() {
		return description;
	}
	public String getDirector() {
		return director;
	}
	public String getProducer() {
		return producer;
	}
	public int getRelease_year() {
		return release_year;
	}
	public int getRunning_time() {
		return running_time;
	}
	public int getRt_score() {
		return rt_score;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setOrignal_title(String orignal_title) {
		this.orignal_title = orignal_title;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}
	public void setRunning_time(int running_time) {
		this.running_time = running_time;
	}
	public void setRt_score(int rt_score) {
		this.rt_score = rt_score;
	}
	public MovieModel(String title, String orignal_title, String description, String director, String producer,
			int release_year, int running_time, int rt_score) {
		super();
		this.title = title;
		this.orignal_title = orignal_title;
		this.description = description;
		this.director = director;
		this.producer = producer;
		this.release_year = release_year;
		this.running_time = running_time;
		this.rt_score = rt_score;
	}
	public MovieModel() {
		super();
	}
	@Override
	public String toString() {
		return "MovieModel [title=" + title + ", orignal_title=" + orignal_title + ", description=" + description
				+ ", director=" + director + ", producer=" + producer + ", release_year=" + release_year
				+ ", running_time=" + running_time + ", rt_score=" + rt_score + "]";
	}
	
	
}
