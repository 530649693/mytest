package com.mytest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBCTest {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/test";
		String user="root";
		String password="root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("驱动加载成功");
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("链接数据库成功");
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from user");
			System.out.println("id \t name");
			while(rs.next()){
				System.out.print(rs.getInt("id")+"\t");
				System.out.print(rs.getString("name")+"\n");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
