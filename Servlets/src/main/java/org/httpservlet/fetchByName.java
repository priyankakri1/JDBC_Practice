package org.httpservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/ftchname")
public class fetchByName extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String sname = req.getParameter("name");//"1"
		
		
		PrintWriter out = res.getWriter();
//		 res.setContentType("text/html");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String qry = "select * from btm.student where name = ?";
   
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			
			pstmt = con.prepareStatement(qry);
			pstmt.setString(1, sname);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int  id = rs.getInt(1);
				String sdept = rs.getString(3);
				int perc = rs.getInt(4);
				out.println("<html><body><h1>"+sname+ " "+ sdept + " "+perc+"</h1></body></html>");
			}else {
				out.println("<html><body><h1 style='color:red;'>name is invalid </h1></body></html>");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
       
}
