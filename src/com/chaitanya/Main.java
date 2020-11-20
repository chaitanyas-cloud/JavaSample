package com.chaitanya;

import com.chaitanya.dao.CourseDAO;
import com.chaitanya.model.Course;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	/*// write your code here
        System.out.println("Chaitanya");
        System.out.println("============Get All cources==========");
        CourseDAO courseDAO = new CourseDAO();
        List<Course> courses = courseDAO.getAllCourses();
        //courses.forEach(System.out::println);
        courses.stream().forEach((c) -> System.out.println(c.getCourseNo() +" "+c.getCourseName() +" "+ c.getCourseFee()));
        System.out.println("============Update cources==========");
        Course courses1 = new Course();
        courses1.setCourseNo(3);
        courses1.setCourseName("GCP");
        courses1.setCourseFee(25000);
        Course courses2 = courseDAO.updateCourse(courses1);
        System.out.println(courses2.getCourseNo() +" "+ courses2.getCourseName()+ " "+courses2.getCourseFee());
        System.out.println("============Get All cources==========");*/
        ArrayList<Integer> myInteger = new ArrayList<Integer>();
        myInteger.add(1);
        myInteger.add(5);
        myInteger.add(0);
        myInteger.add(25);
        myInteger.add(30);
        Collections.sort(myInteger);
        for (int i:myInteger) {
            System.out.println(i);
        }
        System.out.println("ABC");

    }
}
