package com.nikh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		System.out.println("sum of two is "+ k);
		req.setAttribute("k", k);
		
//		PrintWriter out = res.getWriter();
//		out.println("Sum of two is "+ k);
				
		RequestDispatcher rd = req.getRequestDispatcher("sqr");
		rd.forward(req, res);
	}
}
