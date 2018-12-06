package com.myJavaBlog.posts;

public class Post {
	private int id;
	private String title;
	private String content;
	
	public Post(int id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
}
