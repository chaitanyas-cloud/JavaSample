package com.chaitanya.dao;

import com.chaitanya.model.Course;

import java.util.*;

public class CourseDAO {

    private static final Map<Integer, Course> courseMap = new HashMap<Integer, Course>();
    static{
        initCourses();
    }

    private static void initCourses(){
        Course course1 =new Course(01,"Java",10000);
        Course course2 =new Course(02,"J2EE",12000);
        Course course3 =new Course(03,"AWS",15000);

        courseMap.put(course1.getCourseNo(),course1);
        courseMap.put(course2.getCourseNo(),course2);
        courseMap.put(course3.getCourseNo(),course3);

    }
    //for get all courses /courses "GET"
    public List<Course> getAllCourses(){
        Collection<Course> courses = courseMap.values();
        List<Course> courseList = new ArrayList<Course>();
        courseList.addAll(courses);
        return courseList;
    }
    //for get one course /course/01
    public Course getCourse(int courseNo){
        return courseMap.get(courseNo);
    }
    //for post /course "POST"
    public Course addCourse(Course course){
        courseMap.put(course.getCourseNo(),course);
        return course;
    }
    //For UPDATE /course "UPDATE"
    public Course updateCourse(Course course){
        courseMap.put(course.getCourseNo(),course);
        return course;
    }
    public void deleteCouse(int courseNo){
        courseMap.remove(courseNo);
    }
}
