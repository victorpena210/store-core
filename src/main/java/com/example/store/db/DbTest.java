package com.example.store.db;

import java.sql.Connection;
import java.sql.DriverManager;
public class DbTest {
	public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/storeCoreDB?useSSL=false&serverTimezone=UTC";
        String user = "storecoreuser";
        String pass = "rootroot";
        
        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
        	System.out.println("✅ Connected to MySQL!");
        } catch (Exception e) {
        	e.printStackTrace();
        }
	}
}