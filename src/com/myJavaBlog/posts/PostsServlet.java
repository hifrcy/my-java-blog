package com.myJavaBlog.posts;

import java.io.IOException;
import java.util.ArrayList;

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
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var posts = new ArrayList<Post>();
		posts.add(
			new Post(1, "lorem ipsum", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.")
		);
		posts.add(
			new Post(2, "elsass ipsum", "Lorem Elsass ipsum Wurschtsalad DNA, geïz commodo placerat.")
		);
		request.setAttribute("posts", posts);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/posts/index.jsp").forward(request, response);
	}

}
