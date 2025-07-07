package com.java.core;

import java.sql.*;

public class JDBCAPP {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/centralusers";
        String username = "root";
        String password = "Asdf@1234";
        String query = "SELECT * FROM users WHERE id = 1";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection(url, username, password);

            Statement st = c.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                
                System.out.println("User ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
            }

            rs.close();
            st.close();
            c.close();
            System.out.println("Connection closed.");

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
    }
}