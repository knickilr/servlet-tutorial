package com.nikh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		System.out.println("sum of two is "+ k); 

		//Sending the response to client
//		PrintWriter out = res.getWriter();
//		out.println("Sum of two is "+ k);
		
//		Using RequestDispatcher to forward the request to another servlet
//		req.setAttribute("k", k);
//		RequestDispatcher rd = req.getRequestDispatcher("sqr");
//		rd.forward(req, res);
		
		//Using Redirect to send the response to client stating to redirect to another page
//		res.sendRedirect("sqr?k="+k); //url rewriting
		
		//using HttpSession to send data to another servlet
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
//		res.sendRedirect("sqr");
		
		Cookie cookie = new Cookie("k", k+"");
		res.addCookie(cookie);
		res.sendRedirect("sqr");
	}
}
