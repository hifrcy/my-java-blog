package com.myJavaBlog.posts;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostsServlet
 */
@WebServlet("/posts")
public class PostsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PostManager postManager;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostsServlet() {
        super();
        
        this.postManager = new PostManager();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("id") == null) {
			request.setAttribute("posts", this.postManager.getAllPosts());
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/posts/index.jsp").forward(request, response);
		}
		else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/posts/read.jsp").forward(request, response);
		}
	}

}
