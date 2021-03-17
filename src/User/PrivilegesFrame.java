/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

/**
 *
 * @author Alaa_Sayed
 */
public class PrivilegesFrame extends javax.swing.JFrame {

    /**
     * Creates new form PrivilegesFrame
     */
    public PrivilegesFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Learning Management System");
        Image img = (new ImageIcon(getClass().getResource("logo2.png"))).getImage();
        setIconImage(img);
        jLabel2.setText("Welcome " + UserModel.getFirstName() + " " + UserModel.getLastName());
        jLabel23.setText("Update Privileges For User " + SelectedUserModel.getFirstName() + " " + SelectedUserModel.getLastName());
        jLabel24.setText(SelectedUserModel.getType());
        
        

        getLastUpdatesOnPrivileges();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jCheckBox18 = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        jCheckBox19 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Learning Management System");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User/logo2.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Privileges");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("View Lectures");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Add Assignment");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Add Course");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 580, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Add Exam");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Delete Lectures");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Update Assignment");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Update Course");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 640, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Delete Assignment");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("Add Lecture");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Update Lectures");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, -1, -1));
        getContentPane().add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, -1));
        getContentPane().add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, -1, -1));
        getContentPane().add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, -1, -1));
        getContentPane().add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 580, -1, -1));
        getContentPane().add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 640, -1, -1));
        getContentPane().add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 220, -1, -1));
        getContentPane().add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Update Exam");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Register Courses (Students Only)");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("Delete Course");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 700, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setText("Correct Exams");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setText("Delete Exam");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(240, 240, 240));
        jLabel21.setText("Generate Results/Statistics");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(240, 240, 240));
        jLabel22.setText("Assign Students to Exams");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, -1, -1));
        getContentPane().add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, -1, -1));
        getContentPane().add(jCheckBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 320, -1, -1));
        getContentPane().add(jCheckBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, -1, -1));
        getContentPane().add(jCheckBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 420, -1, -1));
        getContentPane().add(jCheckBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 470, -1, -1));
        getContentPane().add(jCheckBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 520, -1, -1));
        getContentPane().add(jCheckBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 700, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 740, 80, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(240, 240, 240));
        jLabel23.setText("jLabel23");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 210, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(240, 240, 240));
        jLabel24.setText("jLabel24");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 310, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("Update Privileges");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 420, -1, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(240, 240, 240));
        jLabel25.setText("View Assignments");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, -1, -1));
        getContentPane().add(jCheckBox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 630, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(240, 240, 240));
        jLabel26.setText("View Exams");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 690, -1, -1));
        getContentPane().add(jCheckBox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 680, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/main_background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new UserDetailsJFrame().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            if(jCheckBox10.isSelected())// View Lectures
            {
                updateUserPrivilege("view_lectures" , "true");
            }
            else{
                updateUserPrivilege("view_lectures" , "false");
            }
            if(jCheckBox1.isSelected())// Add Lecture
            {
                System.out.println("true");
                updateUserPrivilege("add_lecture" , "true");
            }
            else{
                System.out.println("false");
                updateUserPrivilege("add_lecture" , "false");
            }
            if(jCheckBox2.isSelected())// Update Lecture
            {
                updateUserPrivilege("update_lecture" , "true");
            }
            else{
                updateUserPrivilege("update_lecture" , "false");
            }
            if(jCheckBox3.isSelected())// Delete Lecture
            {
                updateUserPrivilege("delete_lecture" , "true");
            }
            else{
                updateUserPrivilege("delete_lecture" , "false");
            }
            if(jCheckBox4.isSelected())// Add Assignment
            {
                updateUserPrivilege("add_assignment" , "true");
            }
            else{
                updateUserPrivilege("add_assignment" , "false");
            }
            if(jCheckBox5.isSelected())// Update Assignment
            {
                updateUserPrivilege("update_assignment" , "true");
            }
            else{
                updateUserPrivilege("update_assignment" , "false");
            }
            if(jCheckBox6.isSelected())// Delete Assignment
            {
                updateUserPrivilege("delete_assignment" , "true");
            }
            else{
                updateUserPrivilege("delete_assignment" , "false");
            }
            if(jCheckBox9.isSelected())// Add Exam
            {
                updateUserPrivilege("add_exam" , "true");
            }
            else{
                updateUserPrivilege("add_exam" , "false");
            }
            if(jCheckBox11.isSelected())// Update Exam
            {
                updateUserPrivilege("update_exam" , "true");
            }
            else{
                updateUserPrivilege("update_exam" , "false");
            }
            if(jCheckBox12.isSelected())// Delete Exam
            {
                updateUserPrivilege("delete_exam" , "true");
            }
            else{
                updateUserPrivilege("delete_exam" , "false");
            }
            if(jCheckBox13.isSelected())// Register Courses
            {
                updateUserPrivilege("register_courses" , "true");
            }
            else{
                updateUserPrivilege("register_courses" , "false");
            }
            if(jCheckBox14.isSelected())// Assign Students to exams
            {
                updateUserPrivilege("assign_students_to_exam" , "true");
            }
            else{
                updateUserPrivilege("assign_students_to_exam" , "false");
            }
            if(jCheckBox15.isSelected())// Correct Exams
            {
                updateUserPrivilege("correct_exams" , "true");
            }
            else{
                updateUserPrivilege("correct_exams" , "false");
            }
            if(jCheckBox16.isSelected())// Generate Results/Statistics
            {
                updateUserPrivilege("generate_results" , "true");
            }
            else{
                updateUserPrivilege("generate_results" , "false");
            }
            if(jCheckBox7.isSelected())// Add Course
            {
                updateUserPrivilege("add_course" , "true");
            }
            else{
                updateUserPrivilege("add_course" , "false");
            }
            if(jCheckBox8.isSelected())// Update Course
            {
                updateUserPrivilege("update_course" , "true");
            }
            else{
                updateUserPrivilege("update_course" , "false");
            }
            if(jCheckBox17.isSelected())// Delete Course
            {
                updateUserPrivilege("delete_course" , "true");
            }
            else{
                updateUserPrivilege("delete_course" , "false");
            }
            if(jCheckBox18.isSelected())// View Assignments
            {
                updateUserPrivilege("view_assignments" , "true");
            }
            else{
                updateUserPrivilege("view_assignments" , "false");
            }
            if(jCheckBox19.isSelected())// View Exams
            {
                updateUserPrivilege("view_exam" , "true");
            }
            else{
                updateUserPrivilege("view_exam" , "false");
            }
            clearAlreadySelections();
            getLastUpdatesOnPrivileges();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrivilegesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrivilegesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrivilegesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrivilegesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrivilegesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private void updateUserPrivilege(String colName, String value) {
        Connection myConnObj = null;
        Statement myStatObj =null;
        ResultSet myResObj = null;
        
        
        
        String query = "update user set "+colName+" = '"+value+"' where userName = '"+SelectedUserModel.getUsername()+"' ";
        
        System.out.println(query);
        try{
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system" , "root" ,"1234");
            PreparedStatement ps = myConnObj.prepareStatement(query);
            ps.executeUpdate();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

    private void getLastUpdatesOnPrivileges() {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        String query = "Select * from user where username = '"+SelectedUserModel.getUsername()+"'";
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
            myStatObj = myConnObj.createStatement();
            myResObj = myStatObj.executeQuery(query);
            while (myResObj.next()) {
                boolean viewLectures = Boolean.parseBoolean(myResObj.getString("view_lectures"));
                boolean addLecture = Boolean.parseBoolean(myResObj.getString("add_lecture"));
                boolean updateLecture = Boolean.parseBoolean(myResObj.getString("update_lecture"));
                boolean deleteLecture = Boolean.parseBoolean(myResObj.getString("delete_lecture"));
                boolean addAssignment = Boolean.parseBoolean(myResObj.getString("add_assignment"));
                boolean updateAssignment = Boolean.parseBoolean(myResObj.getString("update_assignment"));
                boolean deleteAssignment = Boolean.parseBoolean(myResObj.getString("delete_assignment"));
                boolean addExam = Boolean.parseBoolean(myResObj.getString("add_exam"));
                boolean updateExam = Boolean.parseBoolean(myResObj.getString("update_exam"));
                boolean deleteExam = Boolean.parseBoolean(myResObj.getString("delete_exam"));
                boolean registerCourses = Boolean.parseBoolean(myResObj.getString("register_courses"));
                boolean assignStudentsToExam = Boolean.parseBoolean(myResObj.getString("assign_students_to_exam"));
                boolean correctExams = Boolean.parseBoolean(myResObj.getString("correct_exams"));
                boolean generateResults = Boolean.parseBoolean(myResObj.getString("generate_results"));
                boolean addCourse = Boolean.parseBoolean(myResObj.getString("add_course"));
                boolean updateCourse = Boolean.parseBoolean(myResObj.getString("update_course"));
                boolean deleteCourse = Boolean.parseBoolean(myResObj.getString("delete_course"));
                boolean viewAssignments = Boolean.parseBoolean(myResObj.getString("view_assignments"));
                boolean viewExam = Boolean.parseBoolean(myResObj.getString("view_exam"));
                
                UserPrivilegesModel.setAddAssignment(addAssignment);
                UserPrivilegesModel.setAddCourse(addCourse);
                UserPrivilegesModel.setAddExam(addExam);
                UserPrivilegesModel.setAddLecture(addLecture);
                UserPrivilegesModel.setAssignStudentsToExam(assignStudentsToExam);
                UserPrivilegesModel.setCorrectExams(correctExams);
                UserPrivilegesModel.setDeleteAssignment(deleteAssignment);
                UserPrivilegesModel.setDeleteCourse(deleteCourse);
                UserPrivilegesModel.setDeleteExam(deleteExam);
                UserPrivilegesModel.setDeleteLecture(deleteLecture);
                UserPrivilegesModel.setGenerateResults(generateResults);
                UserPrivilegesModel.setRegisterCourses(registerCourses);
                UserPrivilegesModel.setUpdateAssignment(updateAssignment);
                UserPrivilegesModel.setUpdateExam(updateExam);
                UserPrivilegesModel.setUpdateCourse(updateCourse);
                UserPrivilegesModel.setUpdateLecture(updateLecture);
                UserPrivilegesModel.setViewLectures(viewLectures);
                UserPrivilegesModel.setViewAssignment(viewAssignments);
                UserPrivilegesModel.setViewExam(viewExam);
                
                jCheckBox1.setSelected(addLecture); // Add Lecture
                jCheckBox2.setSelected(updateLecture); // Update Lecture
                jCheckBox3.setSelected(deleteLecture); // Delete Lecture
                jCheckBox4.setSelected(addAssignment); // Add Assignment
                jCheckBox5.setSelected(updateAssignment); // Update Assignment
                jCheckBox6.setSelected(deleteAssignment); // Delete Assignment
                jCheckBox9.setSelected(addExam); // Add Exam
                jCheckBox11.setSelected(updateExam); // Update Exam
                jCheckBox12.setSelected(deleteExam); // Delete Exam
                jCheckBox13.setSelected(registerCourses); // Register Courses
                jCheckBox14.setSelected(assignStudentsToExam); //Assign Students to exams
                jCheckBox15.setSelected(correctExams); // Correct Exams
                jCheckBox16.setSelected(generateResults); // Generate Results/Statistics
                jCheckBox7.setSelected(addCourse); // Add Course
                jCheckBox8.setSelected(updateCourse); //Update Course
                jCheckBox17.setSelected(deleteCourse); // Delete Course
                jCheckBox10.setSelected(viewLectures);// View Lectures
                jCheckBox18.setSelected(viewAssignments); 
                jCheckBox19.setSelected(viewExam);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void clearAlreadySelections() {
            jCheckBox1.setSelected(false); // Add Lecture
            jCheckBox2.setSelected(false); // Update Lecture
            jCheckBox3.setSelected(false); // Delete Lecture
            jCheckBox4.setSelected(false); // Add Assignment
            jCheckBox5.setSelected(false); // Update Assignment
            jCheckBox6.setSelected(false); // Delete Assignment
            jCheckBox9.setSelected(false); // Add Exam
            jCheckBox11.setSelected(false); // Update Exam
            jCheckBox12.setSelected(false); // Delete Exam
            jCheckBox13.setSelected(false); // Register Courses
            jCheckBox14.setSelected(false); //Assign Students to exams
            jCheckBox15.setSelected(false); // Correct Exams
            jCheckBox16.setSelected(false); // Generate Results/Statistics
            jCheckBox7.setSelected(false); // Add Course
            jCheckBox8.setSelected(false); //Update Course
            jCheckBox17.setSelected(false); // Delete Course
            jCheckBox10.setSelected(false);// View Lectures
            jCheckBox18.setSelected(false); // View Assignments
            jCheckBox19.setSelected(false);
    }
}
