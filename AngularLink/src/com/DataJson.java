package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DataJson
 */
@WebServlet("/DataJson")
public class DataJson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JSONManager jsonManager = new JSONManager();	
		DBManager dbManager = new DBManager();	
		String productJSON = jsonManager.getProductJSON(dbManager.getProducts());
		PrintWriter writer = response.getWriter();
		writer.write(productJSON);
	}

}
