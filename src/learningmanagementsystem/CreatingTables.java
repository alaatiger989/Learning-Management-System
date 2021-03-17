/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alaa_Sayed
 */
public class CreatingTables {

    public CreatingTables() {
        Connection Conn;
        String query = "CREATE TABLE assignment ( \n" +
"        required_assignment VARCHAR(200) , \n" +
"        delivery_date VARCHAR(200),\n" +
"        creator_name VARCHAR(200),  \n" +
                "course_name VARCHAR(200));";
        
        String query2 = "CREATE TABLE course ( \n" +
"        name VARCHAR(200) , \n" +
"        prof_name VARCHAR(200),\n" +
"        assis_name VARCHAR(200), \n" +
                "creator_name VARCHAR(200));";
        
        String query3 = "CREATE TABLE exam ( \n" +
"        course_name VARCHAR(200) , \n" +
"        prof_name VARCHAR(200),\n" +
"        exam_type VARCHAR(200), \n" +
                 "required_time VARCHAR(200), \n" +
                "date_of_exam VARCHAR(200), \n" +
                "creator_name VARCHAR(200) \n" +
"        );";
        
        String query4 = "CREATE TABLE lectures ( \n" +
"        name VARCHAR(200) , \n" +
"        course_name VARCHAR(200),\n" +
"        day VARCHAR(200), \n" +
                 "time VARCHAR(200), \n" +
                 "place VARCHAR(200), \n" +
                "prof_name VARCHAR(200) \n" +
"       );";
        
        String query6 = "CREATE TABLE questions ( \n" +
"        course_name VARCHAR(200), \n" +
"        exam_type VARCHAR(200),\n" +
"        required_time VARCHAR(200), \n" +
                 "exam_date VARCHAR(200), \n" +
                 "question VARCHAR(200), \n" +
                "choice_a VARCHAR(200), \n" +
                "choice_b VARCHAR(200), \n" +
                "choice_c VARCHAR(200), \n" +
                "choice_d VARCHAR(200), \n" +
                "answer VARCHAR(200), \n" +
                "question_grade VARCHAR(200) \n" +
"        );";
        
       
        
        String query7 = "CREATE TABLE student ( \n" +
"        username VARCHAR(200) , \n" +
"        first_name VARCHAR(200),\n" +
"        last_name VARCHAR(200), \n" +
                 "course_regiestered VARCHAR(200) \n" +
              
"       );";
        String query8 = "CREATE TABLE studentsgrades ( \n" +

"        exam_type VARCHAR(200),\n" +
"        exam_date VARCHAR(200), \n" +
                 "student_username VARCHAR(200), \n" +
                "student_first_name VARCHAR(200), \n" +
                "student_last_name VARCHAR(200), \n" +
                 "student_grade VARCHAR(200), \n" +
                 "totalExamGrade VARCHAR(200), \n" +
                "course_name VARCHAR(200));" ;

        String query9 = "CREATE TABLE user ( \n" +

"        username VARCHAR(200),\n" +
                "        password VARCHAR(200),\n" +
                "        first_name VARCHAR(200),\n" +
                "        last_name VARCHAR(200),\n" +
                "        type VARCHAR(200),\n" +
                "        view_lectures VARCHAR(200),\n" +
                "        add_lecture VARCHAR(200),\n" +
                "        update_lecture VARCHAR(200),\n" +
                "        delete_lecture VARCHAR(200),\n" +
                "        add_assignment VARCHAR(200),\n" +
                "        update_assignment VARCHAR(200),\n" +
                "        delete_assignment VARCHAR(200),\n" +
                "        add_exam VARCHAR(200),\n" +
                "        update_exam VARCHAR(200),\n" +
                "        delete_exam VARCHAR(200),\n" +
                "        register_courses VARCHAR(200),\n" +
                "        assign_students_to_exam VARCHAR(200),\n" +
                "        correct_exams VARCHAR(200),\n" +
                "        generate_results VARCHAR(200),\n" +
                "        add_course VARCHAR(200),\n" +
                "        update_course VARCHAR(200),\n" +
                "        delete_course VARCHAR(200),\n" +
                
                "        view_assignments VARCHAR(200),\n" +
"        view_exam VARCHAR(200));"; 
        String query5 = "Insert Into user Values('admin' , '1234' , 'Admin' , '.LMS' , 'Admin' , 'true', 'true', 'true', 'true', 'true', 'true', 'true', 'true', 'true', 'true', 'true', 'true', 'true', 'true', 'true', 'true', 'true', 'true', 'true')";
        
            try { 
                Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_management_system" , "root" ,"1234");
            Statement ps = Conn.createStatement();
            ps.executeUpdate(query);
            ps.executeUpdate(query2);
             ps.executeUpdate(query3);
              ps.executeUpdate(query4);
               
               ps.executeUpdate(query6);
               ps.executeUpdate(query7);
               ps.executeUpdate(query8);
               ps.executeUpdate(query9);
               ps.executeUpdate(query5);
            } catch (SQLException ex) {
                Logger.getLogger(CreatingDB.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
