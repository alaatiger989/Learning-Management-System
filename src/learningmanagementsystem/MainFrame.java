/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningmanagementsystem;

import Course.CoursesManagement;
import Exam.ExamManagement;
import LoginSystem.Login;
import User.Profile;
import User.SelectedUserModel;
import User.UserDetailsJFrame;
import User.UserModel;
import User.UserPrivilegesModel;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

/**
 *
 * @author Alaa_Sayed
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Learning Management System");
        Image img = (new ImageIcon(getClass().getResource("logo2.png"))).getImage();
        setIconImage(img);
        
        jLabel2.setText("Welcome "+UserModel.getFirstName() + " " + UserModel.getLastName());
        
        
        if(UserModel.getType().equalsIgnoreCase("Admin"))
        {
            jButton3.setVisible(true);
        }
        else{
            jButton3.setVisible(false);
        }
        try{
            getLastUpdatesOnPrivileges();
        }
        catch(Exception e)
        {getLastUpdatesOnPrivileges();
            
        }
        
    }

    private void getLastUpdatesOnPrivileges() {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        String query = "Select * from user where username = '"+UserModel.getUsername()+"'";
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
                
               
            }
        } catch (SQLException e) {
            e.printStackTrace();
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Learning Management System");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/learningmanagementsystem/logo2.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Courses System");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 570, 190, 60));

        jButton2.setBackground(new java.awt.Color(0, 51, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("Exams System");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 180, 190, 60));

        jButton3.setBackground(new java.awt.Color(0, 51, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(240, 240, 240));
        jButton3.setText("System Users");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 190, 60));

        jButton4.setBackground(new java.awt.Color(0, 51, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(240, 240, 240));
        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 740, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 51, 153));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(240, 240, 240));
        jButton5.setText("Refresh System");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/main_background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
        new UserDetailsJFrame().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        // TODO add your handling code here:
        dispose();
        new Profile().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new CoursesManagement().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        new ExamManagement().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        System.out.println(UserModel.getUsername());
        getLastUpdatesOnPrivileges();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
