<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.myJavaBlog.posts.Post" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My posts</title>
</head>
<body>
<h1>My Posts</h1>
<ul>
	<% for(Post post : (List<Post>)request.getAttribute("posts")) { %>
		<li><a href="?id=<%= post.getId() %>"><%= post.getTitle() %></a></li>
	<% } %>
</ul>
</body>
</html>