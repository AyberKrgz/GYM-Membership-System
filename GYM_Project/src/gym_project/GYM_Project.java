package gym_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class GYM_Project {

    Connection connection = DatabaseConnector.connect();
    
    public static void main(String[] args) {
        DatabaseConnector DLoginFrame = new DatabaseConnector();
        DLoginFrame.setVisible(true);
        DLoginFrame.pack();
        DLoginFrame.setLocationRelativeTo(null); //center
        
        System.out.println("SA");

    }
    
}
