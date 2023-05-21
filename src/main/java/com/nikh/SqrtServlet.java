package com.nikh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqrtServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException {
		PrintWriter out = res.getWriter();
					
		try {
			int k = (int) req.getAttribute("k");
			k = k*k;
//			int j = Integer.parseInt(req.getParameter("num2"));
			out.println("Square is "+k);
		} catch(Exception e) {
			out.print("Value of k is ");
			System.out.print("There is an exception"+e);
		}

	}

}
