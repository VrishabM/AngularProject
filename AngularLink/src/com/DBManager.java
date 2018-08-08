package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBManager {
	Connection conn = null;

	public List<User> getProducts() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/greatoutdoor", "root", "root");
			Statement statement = conn.createStatement();
			ResultSet userSet = statement.executeQuery("select * from product");
			ArrayList<User> userList = new ArrayList<User>();
			while (userSet.next()) {
				User user = new User();
				user.setId(userSet.getInt("id"));
				user.setName(userSet.getString("name"));	
				user.setCategory(userSet.getString("category"));
				user.setDescription(userSet.getString("description"));
				user.setPrice(userSet.getInt("price"));
				userList.add(user);
			}
			return userList;
		} catch (Exception e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
			return null;
		}
	}
}
