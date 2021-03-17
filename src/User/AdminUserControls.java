/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alaa_Sayed
 */
public class AdminUserControls {

    private int counter = 0;
    private int courseCounter = 0;

    /**
     * ******************** --------------------------------- Update User
     * ----------------------------------------------------------******
     */
    public void updateUser(String username, String password, String firstName, String lastName, String type, String oldUserName) {
        getActivatedUsers(username);
        if (counter == 0) {
            updateSelectedUser(username, password, firstName, lastName, type, oldUserName);
            JOptionPane.showMessageDialog(null, "User Updated Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Username already Existed, Please Try another one");
        }

    }

    private void getActivatedUsers(String username) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        String query = "Select * from user";
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
            myStatObj = myConnObj.createStatement();
            myResObj = myStatObj.executeQuery(query);
            while (myResObj.next()) {
                String userName = myResObj.getString("username");
                if (username.equalsIgnoreCase(userName)) {
                    counter++;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void updateSelectedUser(String username, String password, String firstName, String lastName, String type, String oldUserName) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        String query = "update user set username = '" + username + "' ,password = '" + password + "', first_name = '" + firstName + "' , last_name = '" + lastName + "', type = '" + type + "' where username = '" + oldUserName + "' ";
        System.out.println(query);
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
            PreparedStatement ps = myConnObj.prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * *******************************************************************************************************************************************************************************
     */
    /**
     * ******************** --------------------------------- Delete User
     * ----------------------------------------------------------******
     */
    public void deleteUser(String userName) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        String query = "Delete From user where username = '" + userName + "'";
        System.out.println(query);
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
            PreparedStatement ps = myConnObj.prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * *******************************************************************************************************************************************************************************
     */
    /**
     * ******************** --------------------------------- Add Course
     * ----------------------------------------------------------******
     */
    public void addCourse(String courseName, String profName, String assisName, String creatorName) {
        getActivatedCourses(courseName);
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        if (courseCounter == 0) {
            String query = "Insert Into course Values ('" + courseName + "' , '" + profName + "' , '" + assisName + "' , '" + creatorName + "')";

            try {
                myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
                PreparedStatement ps = myConnObj.prepareStatement(query);
                ps.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "This Course " + courseName + " is already Existed , Enter another one.");
        }

    }

    /**
     * *******************************************************************************************************************************************************************************
     */
    /**
     * ******************** --------------------------------- Update Course
     * ----------------------------------------------------------******
     */
    public void updateCourse(String courseName, String profName, String assisName ,String creatorName, String oldCourseName) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;
        

        String query = "update course set name = '" + courseName + "' , prof_name = '"+profName+"' , assis_name = '"+assisName+"' , creator_name = '"+creatorName+"'   where name = '" + oldCourseName + "' ";
        System.out.println(query);
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
            PreparedStatement ps = myConnObj.prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * *******************************************************************************************************************************************************************************
     */
    public void deleteCourse(String courseName) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;
        

        String query = "Delete from course where name = '"+courseName+"'";
        System.out.println(query);
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
            PreparedStatement ps = myConnObj.prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * *******************************************************************************************************************************************************************************
     */
    
    private void getActivatedCourses(String courseName) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        String query = "Select * from course";
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
            myStatObj = myConnObj.createStatement();
            myResObj = myStatObj.executeQuery(query);
            while (myResObj.next()) {

                String name = myResObj.getString("name");
                if (courseName.equalsIgnoreCase(name)) {
                    courseCounter++;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
