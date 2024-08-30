package gym_project;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class AdminPage extends javax.swing.JFrame {

    public AdminPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        AdminTitle = new javax.swing.JLabel();
        jLabel_selectTable = new javax.swing.JLabel();
        jComboBox_Table = new javax.swing.JComboBox<>();
        GetTable_Button = new javax.swing.JButton();
        jLabel_selectOperation = new javax.swing.JLabel();
        jComboBox_Operation = new javax.swing.JComboBox<>();
        jLabel_PersonID = new javax.swing.JLabel();
        jTextField_PersonID = new javax.swing.JTextField();
        Go_Button = new javax.swing.JButton();
        Logout_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMIN");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Left.setBackground(new java.awt.Color(51, 51, 51));
        Left.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Aerox.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("GYM MANAGEMENT SYSTEM");

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jPanel1.add(Left);
        Left.setBounds(0, 0, 400, 500);

        Right.setBackground(new java.awt.Color(255, 255, 255));
        Right.setForeground(new java.awt.Color(204, 204, 204));
        Right.setMinimumSize(new java.awt.Dimension(400, 500));

        AdminTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        AdminTitle.setForeground(new java.awt.Color(0, 255, 255));
        AdminTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdminTitle.setText("ADMIN");

        jLabel_selectTable.setBackground(new java.awt.Color(51, 51, 51));
        jLabel_selectTable.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel_selectTable.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_selectTable.setText("Select Table");

        jComboBox_Table.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox_Table.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox_Table.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "gym", "personaltrainer", "member", "membership" }));
        jComboBox_Table.setMinimumSize(new java.awt.Dimension(82, 22));
        jComboBox_Table.setPreferredSize(new java.awt.Dimension(82, 22));
        jComboBox_Table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_TableActionPerformed(evt);
            }
        });

        GetTable_Button.setBackground(new java.awt.Color(0, 255, 255));
        GetTable_Button.setForeground(new java.awt.Color(51, 51, 51));
        GetTable_Button.setText("Get the Table");
        GetTable_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetTable_ButtonActionPerformed(evt);
            }
        });

        jLabel_selectOperation.setBackground(new java.awt.Color(51, 51, 51));
        jLabel_selectOperation.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel_selectOperation.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_selectOperation.setText("Select Operation");

        jComboBox_Operation.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox_Operation.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox_Operation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sign Up a New Person", "Go to the Person's Page" }));
        jComboBox_Operation.setMinimumSize(new java.awt.Dimension(82, 22));
        jComboBox_Operation.setPreferredSize(new java.awt.Dimension(82, 22));
        jComboBox_Operation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_OperationActionPerformed(evt);
            }
        });

        jLabel_PersonID.setBackground(new java.awt.Color(51, 51, 51));
        jLabel_PersonID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel_PersonID.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_PersonID.setText("Enter Person's ID:");

        jTextField_PersonID.setBackground(new java.awt.Color(204, 204, 204));
        jTextField_PersonID.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_PersonID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PersonIDActionPerformed(evt);
            }
        });

        Go_Button.setBackground(new java.awt.Color(0, 255, 255));
        Go_Button.setForeground(new java.awt.Color(51, 51, 51));
        Go_Button.setText("GO!");
        Go_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Go_ButtonActionPerformed(evt);
            }
        });

        Logout_Button.setBackground(new java.awt.Color(130, 0, 0));
        Logout_Button.setForeground(new java.awt.Color(51, 51, 51));
        Logout_Button.setText("Log Out");
        Logout_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(AdminTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(GetTable_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_selectTable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox_Table, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox_Operation, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_PersonID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Logout_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Go_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_PersonID)
                        .addComponent(jLabel_selectOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(113, 113, 113))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(AdminTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_selectTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_Table, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GetTable_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_selectOperation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_Operation, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_PersonID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_PersonID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Go_Button)
                .addGap(37, 37, 37)
                .addComponent(Logout_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        jPanel1.add(Right);
        Right.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_TableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_TableActionPerformed

    }//GEN-LAST:event_jComboBox_TableActionPerformed

    private void GetTable_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetTable_ButtonActionPerformed
        
        String tableName = (String) jComboBox_Table.getSelectedItem();

        if (tableName != null && !tableName.isEmpty()) {
            String query = "SELECT * FROM " + tableName;

            try (Connection connection = DatabaseConnector.connect();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery()) {

                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();
                String[] columnNames = new String[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    columnNames[i - 1] = metaData.getColumnName(i);
                }

                DefaultTableModel model = new DefaultTableModel();
                model.setColumnIdentifiers(columnNames);

                while (resultSet.next()) {
                    Object[] rowData = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        rowData[i - 1] = resultSet.getObject(i);
                    }
                    model.addRow(rowData);
                }

                JTable dataTable = new JTable(model);
                JScrollPane scrollPane = new JScrollPane(dataTable);

                // Create a new JFrame
                JFrame displayFrame = new JFrame();
                displayFrame.setLayout(new BorderLayout());
                displayFrame.add(scrollPane, BorderLayout.CENTER);
                displayFrame.setSize(900, 600);  // Set your preferred size
                displayFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                displayFrame.setLocationRelativeTo(null); //center
                displayFrame.setVisible(true);

            } catch (SQLException e) {
                e.printStackTrace();
                // Handle the exception according to your application's needs
            }
        }

    }//GEN-LAST:event_GetTable_ButtonActionPerformed

    private void jComboBox_OperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_OperationActionPerformed

    }//GEN-LAST:event_jComboBox_OperationActionPerformed

    private void jTextField_PersonIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PersonIDActionPerformed

    }//GEN-LAST:event_jTextField_PersonIDActionPerformed

    private void Go_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Go_ButtonActionPerformed

        String bos = "";
        String ID = jTextField_PersonID.getText();

        if( ((String) jComboBox_Operation.getSelectedItem()).equals("Sign Up a New Person") ){

            SignUp SignUpFrame = new SignUp();
            SignUpFrame.setVisible(true);
            SignUpFrame.pack();
            SignUpFrame.setLocationRelativeTo(null); //center
            this.dispose();

        }
        else if( ((String) jComboBox_Operation.getSelectedItem()).equals("Go to the Person's Page") && !(ID.equals(bos)) && databaseIncludes(ID) ){

            MemberInformation InformationFrame = new MemberInformation(ID);
            InformationFrame.setVisible(true);
            InformationFrame.pack();
            InformationFrame.setLocationRelativeTo(null);
            this.dispose();

        }
        else{

            jLabel_PersonID.setText("Invalid ID!!!");
            jLabel_PersonID.setForeground(new java.awt.Color(255, 0, 0));

        }
    }//GEN-LAST:event_Go_ButtonActionPerformed

    public static boolean databaseIncludes(String id) {

        String query = "SELECT COUNT(*) FROM member WHERE mID = ?";

        try (Connection connection = DatabaseConnector.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, id);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    return count > 0; // If count is greater than 0, the ID exists
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception according to your application's needs
        }

        // If an exception occurs or the ID is not found, return false
        return false;

    }
    
    private void Logout_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_ButtonActionPerformed

        System.out.println("Logged out.");
        JOptionPane.showMessageDialog(null, "Logged out!");

        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); //center
        this.dispose();
    }//GEN-LAST:event_Logout_ButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminTitle;
    private javax.swing.JButton GetTable_Button;
    private javax.swing.JButton Go_Button;
    private javax.swing.JPanel Left;
    private javax.swing.JButton Logout_Button;
    private javax.swing.JPanel Right;
    private javax.swing.JComboBox<String> jComboBox_Operation;
    private javax.swing.JComboBox<String> jComboBox_Table;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_PersonID;
    private javax.swing.JLabel jLabel_selectOperation;
    private javax.swing.JLabel jLabel_selectTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_PersonID;
    // End of variables declaration//GEN-END:variables
}
