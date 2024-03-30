
package gym_project;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MemberInformation extends javax.swing.JFrame {
    
    private String mID = "";

    
     private String[] personalTrainers = {"Ayberk Karagöz", "Gül Yasemin", "İrem Beşiroğlu", "Oğuzhan Altın"};
    /**
     * Creates new form MemberInformation
     */
    public MemberInformation() {
        initComponents();
    }
     public MemberInformation(String mID) {
        this.mID= mID;
        initComponents();
        // Additional initialization code...
        
        String query = "SELECT * FROM member WHERE mID = ?";
        
        int TrainerID=0;

        try (Connection connection = DatabaseConnector.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            // Set the user ID parameter in the prepared statement
            preparedStatement.setString(1, mID);

            // Execute the query and get the result set
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                // Update labels with retrieved information
                if (resultSet.next()) {
                    jLabel23.setText(resultSet.getString("mName"));
                    jLabel24.setText(resultSet.getString("mSurname"));
                    jLabel21.setText(resultSet.getString("mPhone"));
                    jLabel28.setText(resultSet.getString("mWeight"));
                    jLabel25.setText(resultSet.getString("mHeight"));
                    jLabel27.setText(resultSet.getString("branch_name"));
                    
                    TrainerID = resultSet.getInt("trainer_id");


                    // Update other labels with the corresponding column names from the database
                    // ...
                }
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception according to your application's needs
        }
        
        
        
        String mPhone = jLabel21.getText();

        String selectQuery = "SELECT membership_duration, membership_type FROM membership WHERE mPhone = ?";

        try (Connection connection = DatabaseConnector.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {

            preparedStatement.setString(1, mPhone);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    // Retrieve the values from the result set
                    String membershipDuration = resultSet.getString("membership_duration");
                    String membershipType = resultSet.getString("membership_type");

                    // Use the retrieved values as needed
                    jLabel30.setText(resultSet.getString("membership_duration"));
                    jLabel29.setText(resultSet.getString("membership_type"));
                    
                    
                    
                    System.out.println("Membership Duration: " + membershipDuration);
                    System.out.println("Membership Type: " + membershipType);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception according to your application's needs
        }
        
        
        
        
        
        
        
        
        
        
        
        String query2 = "SELECT * FROM personaltrainer WHERE trainer_ID = ?";

        try (Connection connection = DatabaseConnector.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(query2)) {

            // Set the user ID parameter in the prepared statement
            preparedStatement.setInt(1, TrainerID);

            // Execute the query and get the result set
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                // Update labels with retrieved information
                if (resultSet.next()) {
                    String nameSurname = "";
                    
                    nameSurname += resultSet.getString("name");
                    nameSurname += " ";
                    nameSurname += resultSet.getString("surname");
                    
                    jLabel17.setText(nameSurname);
                    


                    // Update other labels with the corresponding column names from the database
                    // ...
                }
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception according to your application's needs
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
        
    
    
    
    
    
        
        
    }
     
     
     
     
     
     
     
     
     
     
     
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Member Information");
        setPreferredSize(new java.awt.Dimension(1000, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("Member Information");
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 700));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Aerox.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("GYM MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(316, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 400, 700);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Personal Informations");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(420, 20, 390, 30);

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Surname");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(420, 130, 80, 20);

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(720, 80, 50, 20);

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Phone Number");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(720, 130, 120, 20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 255));
        jLabel10.setText("Information About MemberShip");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(420, 210, 280, 25);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 255, 255));
        jLabel11.setText("Physical Information");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(720, 210, 190, 25);

        jLabel12.setBackground(new java.awt.Color(51, 51, 51));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Membership Type");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(420, 310, 170, 20);

        jLabel13.setBackground(new java.awt.Color(51, 51, 51));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("MemberShip Duration");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(420, 370, 180, 20);

        jLabel14.setBackground(new java.awt.Color(51, 51, 51));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Branch Name");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(420, 250, 170, 20);

        jLabel15.setBackground(new java.awt.Color(51, 51, 51));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Weight");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(720, 250, 90, 20);

        jLabel16.setBackground(new java.awt.Color(51, 51, 51));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Height");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(720, 310, 90, 20);

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Change");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(590, 440, 80, 23);

        jButton2.setBackground(new java.awt.Color(0, 255, 255));
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Log Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(833, 430, 90, 30);

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(850, 330, 75, 23);

        jLabel17.setBackground(new java.awt.Color(51, 51, 51));
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Your Personal Trainer");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(420, 450, 160, 30);

        jLabel21.setBackground(new java.awt.Color(51, 51, 51));
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Your Phone Number");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(720, 150, 120, 30);

        jLabel22.setBackground(new java.awt.Color(51, 51, 51));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Name");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(420, 70, 60, 30);

        jLabel23.setBackground(new java.awt.Color(51, 51, 51));
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Your Name");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(420, 90, 160, 30);

        jLabel24.setBackground(new java.awt.Color(51, 51, 51));
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("Your Surname");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(420, 150, 160, 30);

        jLabel25.setBackground(new java.awt.Color(51, 51, 51));
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Your Height");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(720, 330, 100, 30);

        jLabel26.setBackground(new java.awt.Color(51, 51, 51));
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText(mID);
        jPanel1.add(jLabel26);
        jLabel26.setBounds(720, 90, 160, 30);

        jLabel27.setBackground(new java.awt.Color(51, 51, 51));
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Your Membership Duration");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(420, 270, 180, 30);

        jLabel28.setBackground(new java.awt.Color(51, 51, 51));
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("Your Weight");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(720, 270, 100, 30);

        jLabel29.setBackground(new java.awt.Color(51, 51, 51));
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("Your MemberShip Type");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(420, 330, 180, 30);

        jLabel30.setBackground(new java.awt.Color(51, 51, 51));
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setText("Your Membership Duration");
        jPanel1.add(jLabel30);
        jLabel30.setBounds(420, 390, 180, 30);

        jLabel32.setBackground(new java.awt.Color(51, 51, 51));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setText("Your Personal Trainer");
        jPanel1.add(jLabel32);
        jLabel32.setBounds(420, 430, 180, 20);

        jButton7.setBackground(new java.awt.Color(0, 255, 255));
        jButton7.setForeground(new java.awt.Color(51, 51, 51));
        jButton7.setText("Edit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(850, 270, 75, 23);

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("DELETE MEMBERSHIP");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(620, 500, 180, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("Member Information");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        System.out.println("Logged out.");
        
        JOptionPane.showMessageDialog(null, "Logged out!");
        
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); //center
        this.dispose();
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String selectedTrainerName = (String) JOptionPane.showInputDialog(
                this,
                "Choose a Personal Trainer:",
                "Personal Trainer Selection",
                JOptionPane.QUESTION_MESSAGE,
                null,
                personalTrainers,
                personalTrainers[0]);

        
        
        
        // If a trainer is selected, update the text field with the selected trainer
        if (selectedTrainerName != null) {
            
            
            
            String[] trainerName = selectedTrainerName.split(" ");
            
            String memberId = jLabel26.getText();


            // SQL query to retrieve trainer_id based on trainer_name
            String selectQuery = "SELECT trainer_ID FROM personaltrainer WHERE name = ? and surname = ?";
            int trainerId = 0;

            try (Connection connection = DatabaseConnector.connect();
                 PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {

                preparedStatement.setString(1, trainerName[0]);
                preparedStatement.setString(2, trainerName[1]);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        // Retrieve the trainer_id from the result set
                        trainerId = resultSet.getInt("trainer_ID");

                        // Use the trainerId as needed
                        System.out.println("Trainer ID: " + trainerId);
                    } else {
                        System.out.println("Trainer not found.");
                        // Handle the case where the trainer is not found
                    }
                }

            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception according to your application's needs
            }
            
            
            
            try {
           // Your SQL query to update the mPhone for a member
           String updateQuery = "UPDATE member SET trainer_id = ? WHERE mID = ?";

           try (Connection connection = DatabaseConnector.connect();
                PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {

               // Set the new phone number and member ID as parameters
               preparedStatement.setInt(1, trainerId);
               preparedStatement.setString(2, memberId);

               // Execute the update query
               int rowsAffected = preparedStatement.executeUpdate();

               if (rowsAffected > 0) {
                   System.out.println("Member's personal trainer updated successfully.");
               } else {
                   System.out.println("No member with the specified ID found.");
                   // Handle the case where no member with the specified ID is found
               }
           }

            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception according to your application's needs
            }
            
            
            
            
            
            
            
            
            
            
            
             jLabel17.setText(selectedTrainerName);
        
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          String newHeight = JOptionPane.showInputDialog("Enter new Height:");
          
          String memberId = jLabel26.getText();
    
    // Check if the user provided a new name
    if (newHeight  != null) {
        // Update the text field with the new name
        
        
        try {
           // Your SQL query to update the mPhone for a member
           String updateQuery = "UPDATE member SET mHeight = ? WHERE mID = ?";

           try (Connection connection = DatabaseConnector.connect();
                PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {

               // Set the new phone number and member ID as parameters
               preparedStatement.setString(1, newHeight);
               preparedStatement.setString(2, memberId);

               // Execute the update query
               int rowsAffected = preparedStatement.executeUpdate();

               if (rowsAffected > 0) {
                   System.out.println("Member's mHeight updated successfully.");
               } else {
                   System.out.println("No member with the specified ID found.");
                   // Handle the case where no member with the specified ID is found
               }
           }

       } catch (SQLException e) {
           e.printStackTrace(); // Handle the exception according to your application's needs
       }
        
        
        jLabel25.setText(newHeight );
    }
         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         String newWeight = JOptionPane.showInputDialog("Enter new Weight:");
         
         String memberId = jLabel26.getText();
         
         if (newWeight  != null) {
                try {
           // Your SQL query to update the mPhone for a member
           String updateQuery = "UPDATE member SET mWeight = ? WHERE mID = ?";

           try (Connection connection = DatabaseConnector.connect();
                PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {

               // Set the new phone number and member ID as parameters
               preparedStatement.setString(1, newWeight);
               preparedStatement.setString(2, memberId);

               // Execute the update query
               int rowsAffected = preparedStatement.executeUpdate();

               if (rowsAffected > 0) {
                   System.out.println("Member's mweight updated successfully.");
               } else {
                   System.out.println("No member with the specified ID found.");
                   // Handle the case where no member with the specified ID is found
               }
           }

       } catch (SQLException e) {
           e.printStackTrace(); // Handle the exception according to your application's needs
       }

       jLabel28.setText(newWeight );
         
    
    // Check if the user provided a new name
        
            // Update the text field with the new name
            
        }
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        String mID = jLabel26.getText();

        String mPhone = jLabel21.getText();
        
        try {
            // Your SQL query to delete the member based on mID
            String deleteQuery = "DELETE FROM membership WHERE mPhone = ?";

            try (Connection connection = DatabaseConnector.connect();
                 PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {

                // Set the mID as a parameter
                
                preparedStatement.setString(1, mPhone);

                // Execute the delete query
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Member with mPhone " + mPhone + " deleted successfully.");
                    // Optionally, perform additional actions after deletion
                } else {
                    System.out.println("No member with the specified mPhone found.");
                    // Handle the case where no member with the specified mID is found
                }
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception according to your application's needs
        }
        
        
        
        try {
            // Your SQL query to delete the member based on mID
            String deleteQuery = "DELETE FROM member WHERE mID = ?";

            try (Connection connection = DatabaseConnector.connect();
                 PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {

                // Set the mID as a parameter
                preparedStatement.setString(1, mID);

                // Execute the delete query
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Member with mID " + mID + " deleted successfully.");
                    // Optionally, perform additional actions after deletion
                } else {
                    System.out.println("No member with the specified mID found.");
                    // Handle the case where no member with the specified mID is found
                }
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception according to your application's needs
        }
        
        
        
        
        System.out.println("Deleted your membership.");
        
        JOptionPane.showMessageDialog(null, "Your membership has been deleted successfully!");
        
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); //center
        this.dispose();
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
