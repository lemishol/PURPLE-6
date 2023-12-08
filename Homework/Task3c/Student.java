package Task3c;

import java.util.Comparator;
import java.util.List;
import java.util.Iterator;

public class Student{
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public int getCourse() {
        return this.course;
    }

    public String getName() {
        return this.name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printStudents(List<Student> list, int course) {
        Iterator<Student> student = list.iterator();
        while (student.hasNext()) {
            Student iter = student.next();
            if (iter.getCourse() == course) {
                System.out.println(iter.getName());
            }
        }
    }
    public static Comparator<Student> compareByNames(){
        return Comparator.comparing(Student::getName);
    }
    public static Comparator<Student> compareByCourses(){
         return Comparator.comparing(Student::getCourse);

    }
    @Override
    public String toString(){
        return (getName()+":"+getCourse());
    }
}