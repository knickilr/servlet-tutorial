package com.nikh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqrtServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException {
		PrintWriter out = res.getWriter();
					
		try {
			//receive the data from the dispatched servlet
//			int k = (int) req.getAttribute("k");
//			k = k*k;
			
			//url rewriting
//			int k=Integer.parseInt(req.getParameter("k"));
//			out.println("Square is "+k*k);
			
			HttpSession session = req.getSession();
			int k = (int) session.getAttribute("k");
			out.println("Square using session variable :"+k*k);
			
		} catch(Exception e) {
			out.print("Value of k is ");
			System.out.print("There is an exception"+e);
		}

	}

}
