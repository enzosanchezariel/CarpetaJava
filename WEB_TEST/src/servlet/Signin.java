package servlet;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.User;
import logic.Login;

/**
 * Servlet implementation class Signin
 */
@WebServlet({ "/Signin", "/signin", "/SIGNIN", "/SignIn" })
public class Signin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Login ctrl = new Login();
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		
		User usr = new User(user, password);
		Login login = new Login();
		LinkedList<User> users = login.getAll();
		
		request.getSession().setAttribute("user", usr);
		request.setAttribute("users", users);
		
		// getAttribute es de response y getParameter request
		//response.getWriter().append("User: ").append(usr.getUser()+"\n").append("Password: ").append(usr.getPassword()+"\n");
		
		request.getRequestDispatcher("WEB-INF/UserManagement.jsp").forward(request, response);
		//doGet(request, response);
	}

}
