package com.example.guestbook;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection initializeDatabase() throws Exception {
        String url = "jdbc:mysql://localhost:3306/guestbookdb";
        String user = "root";
        String pass = "";
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(url, user, pass);
    }
}
