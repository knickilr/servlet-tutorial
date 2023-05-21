package com.nikh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		out.print(str);
		
		ServletConfig cfg = getServletConfig();
		String configName = cfg.getInitParameter("name");
		out.println("From servelet COnfig "+configName);
				
	}
}
