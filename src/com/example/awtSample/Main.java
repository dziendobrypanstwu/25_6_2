package com.example.awtSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:/Users/Jan PC/IdeaProjects/25_6_2/testjava.db");
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");

            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
