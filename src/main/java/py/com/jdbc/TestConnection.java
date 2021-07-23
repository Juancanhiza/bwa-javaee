package main.java.py.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hr", "root", "mysql");
        System.out.println(con.getClass());
        System.out.println("Connected to hr Database of MySQL.");
        con.close();
    }
}