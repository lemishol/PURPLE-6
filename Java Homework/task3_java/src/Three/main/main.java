package Three.main;

import Three.student.CourseComparator;
import Three.student.NameComparator;
import Three.student.Student;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("James",6));
        list.add(new Student("Charlotte",2));
        list.add(new Student("Hannah",2));
        list.add(new Student("Niki",3));
        list.add(new Student("Sebastian",4));
        list.sort(new NameComparator());
        System.out.println(list);
        list.sort(new CourseComparator());
        System.out.println(list);
    }
}