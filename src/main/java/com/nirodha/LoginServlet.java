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
		  String name = request.getParameter("name");
		  String password = request.getParameter("password");
		  System.out.println(name+" "+password);
		  request.setAttribute("name", name);
		  request.setAttribute("password", password);
		  request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		  
	  }
	
}
