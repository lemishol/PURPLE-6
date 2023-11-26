package main;

import student.CourseComparator;
import student.NameComparator;
import student.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String printList(ArrayList<Student> l){
        StringBuilder sb = new StringBuilder();
        for (Student i:l)
            sb.append(String.format("Name: %s; Course: %d. \n",  i.getName(), i.getCourse()));
        return sb.toString();
    }
    public static String printSortedListName(ArrayList<Student> l){
        l.sort(new NameComparator());
        return printList(l);
    }
    public static String printSortedListCourse(ArrayList<Student> l){
        l.sort(new CourseComparator());
        return printList(l);
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("James",6));
        list.add(new Student("Charlotte",2));
        list.add(new Student("Hannah",2));
        list.add(new Student("Niki",3));
        list.add(new Student("Sebastian",4));
        System.out.println(printList(list));
        System.out.println(printSortedListName(list));
        System.out.println(printSortedListCourse(list));
    }
}