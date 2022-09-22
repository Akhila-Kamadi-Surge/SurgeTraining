package com.Surge.JDBC;

import java.io.*;
import java.sql.*;


public class InsertIntoDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "root";
		String query = "insert into studenttable values (?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = con.prepareStatement(query);
//			pstmt.setInt(1, 102);
//			pstmt.setString(2, "Alekhya");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			do {
				System.out.println("enter id: ");
				int id = Integer.parseInt(br.readLine());
				System.out.println("enter name : ");
				String name = br.readLine();
				
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				
				int i = pstmt.executeUpdate();
				System.out.println(i+" records affected");
				
				System.out.println("Do you want to continue : y/n");
				String s = br.readLine();
				if(s.startsWith("n")) {
					break;
				}
			}while(true);
			con.close();
			System.out.println("Connection closed");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
