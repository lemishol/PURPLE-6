package Task4c;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void printStudents() {
        List<Student> studentList = new LinkedList<>();
        studentList.add(new Student("Artem", 2));
        studentList.add(new Student("Vlada", 2));
        studentList.add(new Student("Samuel", 3));
        studentList.add(new Student("Vlad", 6));
        studentList.add(new Student("Daniel", 6));
        String expected1 = "Samuel";
        String actual1 = Student.printStudents(studentList, 3).toString();
        assertEquals(expected1, actual1);
        String expected2 = "";
        String actual2 = Student.printStudents(studentList, 5).toString();
        assertEquals(expected2, actual2);

    }

    @Test
    void compareByNames() {
        List<Student> studentList = new LinkedList<>();
        studentList.add(new Student("Artem", 2));
        studentList.add(new Student("Vlada", 2));
        studentList.add(new Student("Samuel", 3));
        studentList.add(new Student("Vlad", 6));
        studentList.add(new Student("Daniel", 6));
        String expected ="[Artem:2, Daniel:6, Samuel:3, Vlad:6, Vlada:2]";
        studentList.sort(Student.compareByNames());
        String actual = studentList.toString();
        assertEquals(expected, actual);
    }

    @Test
    void compareByCourses() {
        List<Student> studentList = new LinkedList<>();
        studentList.add(new Student("Artem", 2));
        studentList.add(new Student("Vlada", 2));
        studentList.add(new Student("Samuel", 3));
        studentList.add(new Student("Vlad", 6));
        studentList.add(new Student("Daniel", 6));
        String expected ="[Artem:2, Vlada:2, Samuel:3, Daniel:6, Vlad:6]";
        studentList.sort(Student.compareByCourses());
        String actual = studentList.toString();
        assertEquals(expected, actual);
    }
}