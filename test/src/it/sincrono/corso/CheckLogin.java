package it.sincrono.corso;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckLogin
 */
@WebServlet("/CheckLogin")
public class CheckLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 String u=request.getParameter("user");
		 
		 RequestDispatcher d=null;
		 
		 if(u.equals("pippo")) {
			d=request.getRequestDispatcher("views/loginOK.jsp");
			 
			 //response.sendRedirect("views/loginOK.jsp");
			 
		 }
		 else {
			 
			 
			 d=request.getRequestDispatcher("views/error.jsp");
			 
			 //response.sendRedirect("views/error.jsp");
		 }
		 d.forward(request, response);
		
	}

}
