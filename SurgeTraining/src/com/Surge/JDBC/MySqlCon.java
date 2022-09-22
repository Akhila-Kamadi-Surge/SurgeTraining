package com.Surge.JDBC;

import java.sql.*;

class MySqlCon  { 
	public static void main(String[] args){
		String url = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "root";
		String query = "select * from studenttable";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established successfully");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
			String name = rs.getString("name");
			int id = rs.getInt("id");
			System.out.println(id+" "+name);
			}
			st.close();
			con.close();
			System.out.println("Connection closed");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
