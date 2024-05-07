package oopsExcercises;

import java.util.ArrayList;

public class Student {
    private String name;
    private float grade;
    private ArrayList<String> courses;

    public Student(String name, float grade, ArrayList<String> courses){
        this.name = name;
        this.grade = grade;
        this.courses = courses;
    }

    public ArrayList<String> getAllCourses(){
        return courses;
    }

    public void addCourse(String course){
        courses.add(course);
    }
    public void removeCourse(String course){
        courses.remove(course);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Prateek", 3.7F, new ArrayList<String>(5));
        s1.addCourse("AOS");
        s1.addCourse("EC");
        s1.addCourse("DB");
        s1.removeCourse("DB");

        System.out.println(s1.getAllCourses());
    }
}
