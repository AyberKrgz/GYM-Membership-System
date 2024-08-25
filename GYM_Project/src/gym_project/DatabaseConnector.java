package gym_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;



public class DatabaseConnector {

    public static Connection connect() {

        Connection connection = null;
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // TODO: Change the username and password to your database username and password!

            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/gymmembership";
            String username = "username";                                                       //You have to change "username" to your database root name.
            String password = "password";                                                       //You have to change "password" to your database password.
            connection = DriverManager.getConnection(url, username, password);

            System.out.println("Connected to the MySQL database!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
