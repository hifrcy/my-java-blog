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
		var post = new Post(1, "lorem ipsum", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		request.setAttribute("post", post);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/posts/index.jsp").forward(request, response);
	}

}
