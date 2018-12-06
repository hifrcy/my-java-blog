package com.myJavaBlog.posts;

import java.util.ArrayList;

public class PostManager {
	private ArrayList<Post> posts;
	
	public PostManager() {
		this.posts = new ArrayList<Post>();
		this.posts.add(
			new Post(1, "lorem ipsum", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.")
		);
		this.posts.add(
			new Post(2, "elsass ipsum", "Lorem Elsass ipsum Wurschtsalad DNA, geïz commodo placerat.")
		);
	}
}
