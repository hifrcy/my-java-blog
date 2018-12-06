package com.myJavaBlog.posts;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PostManager {
	private ArrayList<Post> posts;
	public String jsonString;
	
	public PostManager() {
		this.posts = new ArrayList<Post>();
		this.posts.add(
			new Post(1, "lorem ipsum", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.")
		);
		this.posts.add(
			new Post(2, "elsass ipsum", "Lorem Elsass ipsum Wurschtsalad DNA, geïz commodo placerat.")
		);
		
		URL url = null;
		try {
			url = new URL("https://my-json-server.typicode.com/wasthishelpful/my-java-blog/posts");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		HttpURLConnection connection = null;
		int status = 0;
		try {
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			status = connection.getResponseCode();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(status == 200) {
			InputStreamReader in = null;
			try {
				in = new InputStreamReader(
					connection.getInputStream()
				);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
						
			JSONParser parser = new JSONParser();
	        Object jsonParsed = null;
	        try{
	            jsonParsed = parser.parse(in);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			connection.disconnect();

			JSONArray root = (JSONArray) jsonParsed;
			this.jsonString = root.toJSONString();
		}
	}
	
	public ArrayList<Post> getAllPosts() {
		return this.posts;
	}
}
