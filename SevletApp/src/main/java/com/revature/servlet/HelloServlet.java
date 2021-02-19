package com.revature.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3254009085679988570L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException  {
		PrintWriter pw = resp.getWriter();
		pw.write("BLah");
	}	
	
	@Override
	protected void 
}
