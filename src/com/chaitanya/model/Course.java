package com.chaitanya.model;

public class Course {
    private int courseNo;
    private String courseName;
    private double courseFee;

    public Course(){

    }

    public Course(int courseNo, String courseName, double courseFee) {
        this.courseNo = courseNo;
        this.courseName = courseName;
        this.courseFee = courseFee;
    }

    public int getCourseNo() {
        return courseNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseNo(int courseNo) {
        this.courseNo = courseNo;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }
}
