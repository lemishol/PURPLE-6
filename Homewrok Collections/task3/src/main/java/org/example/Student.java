package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {

        return name;
    }

    public int getCourse() {

        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int compareByName(Student student) {

        return this.name.compareTo(student.name);
    }
    public int compareByCourse(Student student) {

        return Integer.compare(this.course, student.course);
    }

    public static String getStudentsByCourse(List<Student> students, int course) {

        if (students.size() == 0){
            return ";";
        }

        Iterator<Student> iterator = students.iterator();
        List<String> listStudent = new ArrayList<>();


            listStudent.add("\nStudents in course " + course + ":");


        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                listStudent.add(student.getName());
            }
        }
        if(listStudent.size() == 1){
            listStudent.remove(0);
            listStudent.add("On " + course + " course no students");
        }
        return String.join("\n", listStudent);
    }
}
