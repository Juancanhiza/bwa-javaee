package main.java.py.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class AddJob {

    public static void main (String[] args){
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hr", "root", "mysql")){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Insert ID: ");
            String id = scanner.nextLine();
            System.out.println("Insert Title: ");
            String title = scanner.nextLine();
            System.out.println("Insert Min Salary");
            String minSalary = scanner.nextLine();

            String insertQuery = "insert into jobs values(" + "'" + id + "','" + title + "'," + minSalary + ");" ;
            System.out.println("Executing query => " + insertQuery);
            Statement statement = con.createStatement();
            statement.executeUpdate(insertQuery);
            System.out.println("Added job successfully!");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
