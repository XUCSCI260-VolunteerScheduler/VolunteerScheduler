package io.github.xucsci260volunteerscheduler.domain;

import java.sql.Date;
import java.util.List;

/**
 * file State.java was created by chris on 2/7/18 at 4:14 PM
 * for VolunteerScheduler
 */

public class Student extends Volunteer {
    private String school, studentID, major;
    private int gradYear;


    public Student(String first, String last, String email, String address, String city, String zip, Date birthday, String state, List<Date> availableTimes, String school, String studentID, String major, int gradYear) {
        super(first, last, email, address, city, zip, birthday, state, availableTimes);

        this.school = school;
        this.studentID = studentID;
        this.gradYear = gradYear;
        this.major = major;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }
}
