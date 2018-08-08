package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DataServlet")
public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn=null;
		PrintWriter out=response.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/greatoutdoor", "root", "root");
			Statement statement = conn.createStatement();

			ResultSet userSet = statement.executeQuery("select * from product");
           while (userSet.next()) {
        	   out.println("id="+userSet.getInt(1)+"<br/>");
        	   out.println("name="+userSet.getString(2)+"<br/>");
        	   out.println("description="+userSet.getString(3)+"<br/>");
        	   out.println("price="+userSet.getInt(4)+"<br/>");
        	   out.println("category="+userSet.getString(5)+"<br/>");
        	   out.print("<br/><br/><br/>");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
			
		}
	}

}
