package main.java.py.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
    public static void main(String[] args) {
        // ARM: Automatic Resource Management
        // Try with resources
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hr", "root", "mysql")) {
            System.out.println(con.getClass());
            System.out.println("Connected to hr Database of MySQL.");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}