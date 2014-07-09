package com.netpalese.controller.model;

import java.util.List;

public class PostDetail {
	private String title;
	private String content;
	private List<String> categories;
	
	public PostDetail() { }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}	
}
