package com.nirodha;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		  PrintWriter out = response.getWriter();
		  out.println("<html>");
		  out.println("<head>");
		  out.println("<title></title>");
		  out.println("</head>");
		  out.println("<body>");
		  out.println("Hello I am Servlet");
		  out.println("</body>");
		  out.println("</html>");
	  }
	
}
