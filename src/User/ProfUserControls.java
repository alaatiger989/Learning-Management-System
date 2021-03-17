/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Exam.ExamModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Alaa_Sayed
 */
public class ProfUserControls {
    private int lecCounter = 0;
    private int assCounter = 0;
    private int examCounter = 0;
    private int questionCounter = 0;
    /*------------------------------------------------------- Add Lecture -----------------------------------------------*/
    public void addLecture(String lecName , String courseName , String day , String time , String place , String profName)
    {
        getLectures(lecName);
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        if (lecCounter == 0) {
            String query = "Insert Into lectures Values ('" + lecName + "' , '" + courseName + "' , '" + day + "' , '" + time + "' , '"+place+"' , '"+profName+"')";

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
    /*****************************************************************************************************************************/
    /*------------------------------------------------------- Update Lecture -----------------------------------------------*/
    public void updateLecture(String lecName , String courseName , String day , String time , String place , String profName , String oldLectureName)
    {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;
        

        String query = "update lectures set name = '" + lecName + "' , course_name = '"+courseName+"' , day = '"+day+"' , time = '"+time+"' , place = '"+place+"' , prof_name = '"+profName+"'  where name = '" + oldLectureName + "' ";
        System.out.println(query);
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
            PreparedStatement ps = myConnObj.prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /*****************************************************************************************************************************/
    /*------------------------------------------------------- Delete Lecture -----------------------------------------------*/
    public void deleteLecture(String lecName)
    {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;
        

        String query = "Delete from lectures where name = '"+lecName+"'";
        System.out.println(query);
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
            PreparedStatement ps = myConnObj.prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /*****************************************************************************************************************************/
    private void getLectures(String lectureName) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        String query = "Select * from lectures";
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
            myStatObj = myConnObj.createStatement();
            myResObj = myStatObj.executeQuery(query);
            while (myResObj.next()) {
                String lecName = myResObj.getString("name");
                String courseName = myResObj.getString("course_name");
                String day = myResObj.getString("day");
                String time = myResObj.getString("time");
                String place = myResObj.getString("place");
                
                if(lecName.equalsIgnoreCase(lectureName))
                {
                    lecCounter++;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*------------------------------------------------------- Add Lecture -----------------------------------------------*/
    public void addAssignment(String requiredAss , String deliveryDate , String creatorName ,String courseName)
    {
        getAssignments(requiredAss);
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        if (assCounter == 0) {
            String query = "Insert Into assignment Values ('" + requiredAss + "' , '" + deliveryDate + "' , '" + creatorName + "', '"+courseName+"')";

            try {
                myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
                PreparedStatement ps = myConnObj.prepareStatement(query);
                ps.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "This Course " + requiredAss + " is already Existed , Enter another one.");
        }
        
        
    }
    /*****************************************************************************************************************************/
    /*------------------------------------------------------- Update Lecture -----------------------------------------------*/
    public void updateAssignment(String requiredAss , String deliveryDate , String creatorName ,String courseName, String oldRequiredAss)
    {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;
        

        String query = "update assignment set required_assignment = '" + requiredAss + "' , delivery_date = '"+deliveryDate+"' , creator_name = '"+creatorName+"' , course_name = '"+courseName+"' where required_assignment = '" + oldRequiredAss + "' ";
        System.out.println(query);
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
            PreparedStatement ps = myConnObj.prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /*****************************************************************************************************************************/
    /*------------------------------------------------------- Delete Lecture -----------------------------------------------*/
    public void deleteAssignment(String requiredAss)
    {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;
        

        String query = "Delete from assignment where required_assignment = '"+requiredAss+"'";
        System.out.println(query);
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
            PreparedStatement ps = myConnObj.prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /*****************************************************************************************************************************/
    private void getAssignments(String requiredAss) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        String query = "Select * from assignment";
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
            myStatObj = myConnObj.createStatement();
            myResObj = myStatObj.executeQuery(query);
            while (myResObj.next()) {
                String required_assignment = myResObj.getString("required_assignment");
                
                
                if(required_assignment.equalsIgnoreCase(requiredAss))
                {
                    assCounter++;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /*------------------------------------------------------- Add Lecture -----------------------------------------------*/
    public void addExam(String courseName , String profName , String examType ,String requiredTime ,String examDate, String creatorName)
    {
        getExams(courseName , examType, examDate);
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        if (examCounter == 0) {
            String query = "Insert Into exam Values ('" + courseName + "' , '" + profName + "' , '" + examType + "', '"+requiredTime+"' , '"+examDate+"' , '"+creatorName+"')";

            try {
                myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
                PreparedStatement ps = myConnObj.prepareStatement(query);
                ps.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "This Exam is already Existed , Enter another one.");
        }
        
        
    }
    /*****************************************************************************************************************************/
    /*------------------------------------------------------- Update Lecture -----------------------------------------------*/
    public void updateExam(String courseName , String profName , String examType ,String requiredTime ,String examDate, String creatorName, String oldExamDate)
    {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;
        

        String query = "update exam set course_name = '" + courseName + "' , prof_name = '"+profName+"' , exam_type = '"+examType+"' , required_time = '"+requiredTime+"', date_of_exam = '"+examDate+"', creator_name = '"+creatorName+"' where date_of_exam = '" + oldExamDate + "' ";
        System.out.println(query);
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
            PreparedStatement ps = myConnObj.prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /*****************************************************************************************************************************/
    /*------------------------------------------------------- Delete Lecture -----------------------------------------------*/
    public void deleteExam(String examDate)
    {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;
        deleteQuestions(examDate);

        String query = "Delete from exam where date_of_exam = '"+examDate+"' AND course_name = '"+ExamModel.getCourseName()+"' And exam_type = '"+ExamModel.getExamType()+"'";
        System.out.println(query);
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
            PreparedStatement ps = myConnObj.prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /*****************************************************************************************************************************/
    private void getExams(String courseName, String examType ,String examDate) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        String query = "Select * from exam";
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
            myStatObj = myConnObj.createStatement();
            myResObj = myStatObj.executeQuery(query);
            while (myResObj.next()) {
                String course_name = myResObj.getString("course_name");
                String exam_type  = myResObj.getString("exam_type");
                String exam_date = myResObj.getString("date_of_exam");
                if(courseName.equalsIgnoreCase(course_name) &&examType.equalsIgnoreCase(exam_type) &&examDate.equalsIgnoreCase(exam_date))
                {
                    examCounter++;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    /*------------------------------------------------------- Add Lecture -----------------------------------------------*/
    public void addQuestion(String courseName , String examType , String requiredTime ,String examDate ,String question, String choiceA , String choiceB , String choiceC, String choiceD , String choiceAnswer , String grade)
    {
        getQuestions(courseName , examType, examDate , question);
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        if (questionCounter == 0) {
            String query = "Insert Into questions Values ('" + courseName + "' , '" + examType + "' , '" + requiredTime + "', '"+examDate+"' , '"+question+"' , '"+choiceA+"' , '"+choiceB+"' , '"+choiceC+"' , '"+choiceD+"' , '"+choiceAnswer+"' , '"+grade+"')";

            try {
                myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
                PreparedStatement ps = myConnObj.prepareStatement(query);
                ps.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "This Question is already Existed For That Exam, Enter another one.");
        }
        
        
    }
    /*****************************************************************************************************************************/
   public void deleteQuestions(String examDate)
    {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;
        

        String query = "Delete from questions where exam_date = '"+examDate+"' AND course_name = '"+ExamModel.getCourseName()+"' And exam_type = '"+ExamModel.getExamType()+"'";
        System.out.println(query);
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
            PreparedStatement ps = myConnObj.prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void getQuestions(String courseName, String examType ,String examDate , String question) {
        Connection myConnObj = null;
        Statement myStatObj = null;
        ResultSet myResObj = null;

        String query = "Select * from questions";
        try {
            myConnObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system", "root", "1234");
            myStatObj = myConnObj.createStatement();
            myResObj = myStatObj.executeQuery(query);
            while (myResObj.next()) {
                String course_name = myResObj.getString("course_name");
                String exam_type  = myResObj.getString("exam_type");
                String exam_date = myResObj.getString("exam_date");
                String ques = myResObj.getString("question");
                if(courseName.equalsIgnoreCase(course_name) &&examType.equalsIgnoreCase(exam_type) &&examDate.equalsIgnoreCase(exam_date) && ques.equalsIgnoreCase(question))
                {
                    questionCounter++;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
