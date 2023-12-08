package Task3c;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new LinkedList<>();
        studentList.add(new Student("Artem", 2));
        studentList.add(new Student("Vlada", 2));
        studentList.add(new Student("Samuel", 3));
        studentList.add(new Student("Vlad", 6));
        studentList.add(new Student("Daniel", 6));

        Student.printStudents(studentList, 3);
        studentList.sort(Student.compareByNames());
        System.out.println(studentList);
        studentList.sort(Student.compareByCourses());
        System.out.println(studentList);
    }
}
