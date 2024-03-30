package gym_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class GYM_Project {

    Connection connection = DatabaseConnector.connect();
    
    public static void main(String[] args) {
        // TODO code application logic here
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); //center
        
        
        
        
        
        
        
        
        
        System.out.println("SA");
        
        
        
    }
    
}
