package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class EstablishConnection {

    public static void main(String[] args) {

        try {

            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Connect to Oracle Database
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "system",
                    "Mahitha@4754"
            );

            System.out.println("Connection Established successfully");

            con.close();

        } catch (Exception e) {

            System.out.println("Connection could not be established");
            System.out.println("Exception: " + e.getMessage());

        }
    }
}