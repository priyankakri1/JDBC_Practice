 package org.genericservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.*;
@WebServlet("/fs")
public class genericUI extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Getting the data from UI/
		String name = req.getParameter("nm"); //name 
		String place = req.getParameter("pl"); //place
		
		//Presentation// 
		PrintWriter out=res.getWriter();
		out.println("<html><body bgcolor = 'blue'>" + 
	            "<h1 style='text-align:center;'>Student name is " 
			      + name + " from " + place 
			      +"</h1>"+
			      "</body></html>");
	out.close();
}
}
