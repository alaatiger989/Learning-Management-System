/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

/**
 *
 * @author Alaa_Sayed
 */
public class SelectedCourseModel {
    private static String courseName;
    private static String profName;
    private static String assisName;

    public static String getCourseName() {
        return courseName;
    }

    public static void setCourseName(String courseName) {
        SelectedCourseModel.courseName = courseName;
    }

    public static String getProfName() {
        return profName;
    }

    public static void setProfName(String profName) {
        SelectedCourseModel.profName = profName;
    }

    public static String getAssisName() {
        return assisName;
    }

    public static void setAssisName(String assisName) {
        SelectedCourseModel.assisName = assisName;
    }
}
