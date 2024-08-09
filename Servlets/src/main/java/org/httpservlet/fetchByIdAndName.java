package org.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ftchidname")
public class fetchByIdAndName extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = res.getWriter();
		String id = req.getParameter("id");
		int sid = Integer.parseInt(id);
		String sname = req.getParameter("name");
		
		Connection con= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String qry = "select * from btm.student where id=? and name=?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			pstmt = con.prepareStatement(qry);
			
			pstmt.setInt(1, sid);
			pstmt.setString(2, sname);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				String sdept = rs.getString(3);
				int perc = rs.getInt(4);
				out.println("<html><body><h1>"+sname+ " "+ sdept + " "+perc+"</h1></body></html>");
			}else {
				out.println("<html><body><h1 style='color:red;'>Verification failed</h1></body></html>");
			}
					
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				}
			
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
