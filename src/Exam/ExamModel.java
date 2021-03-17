/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

/**
 *
 * @author Alaa_Sayed
 */
public class ExamModel {
    private static String courseName;
    private static String profName;
    private static String assisName;
    private static String creatorName;
    private static String examTime;
    private static String examPlace;
    private static String examType;
    private static String requiredTime;
    private static String dateOfExam;

    public static String getExamType() {
        return examType;
    }

    public static void setExamType(String examType) {
        ExamModel.examType = examType;
    }

    public static String getRequiredTime() {
        return requiredTime;
    }

    public static void setRequiredTime(String requiredTime) {
        ExamModel.requiredTime = requiredTime;
    }

    public static String getDateOfExam() {
        return dateOfExam;
    }

    public static void setDateOfExam(String dateOfExam) {
        ExamModel.dateOfExam = dateOfExam;
    }

    public static String getCreatorName() {
        return creatorName;
    }

    public static void setCreatorName(String creatorName) {
        ExamModel.creatorName = creatorName;
    }

    public static String getExamTime() {
        return examTime;
    }

    public static void setExamTime(String examTime) {
        ExamModel.examTime = examTime;
    }

    public static String getExamPlace() {
        return examPlace;
    }

    public static void setExamPlace(String examPlace) {
        ExamModel.examPlace = examPlace;
    }
    
    public static String getCourseName() {
        return courseName;
    }

    public static void setCourseName(String courseName) {
        ExamModel.courseName = courseName;
    }

    public static String getProfName() {
        return profName;
    }

    public static void setProfName(String profName) {
        ExamModel.profName = profName;
    }

    public static String getAssisName() {
        return assisName;
    }

    public static void setAssisName(String assisName) {
        ExamModel.assisName = assisName;
    }
    
    
}
