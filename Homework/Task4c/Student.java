package Task4c;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

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

    public static StringBuilder printStudents(List<Student> list, int course) {
        Iterator<Student> student = list.iterator();
        StringBuilder sb = new StringBuilder();
        while (student.hasNext()) {
            Student iter = student.next();
            if (iter.getCourse() == course) {
                System.out.println(iter.getName());
                sb.append(iter.getName());
                sb.append("\n");
            }
        }
        if (sb.toString()!="") {sb.deleteCharAt(sb.length()-1);}
        return sb;
    }
    public static Comparator<Student> compareByNames(){
        return Comparator.comparing(Student::getName).thenComparing(Student::getCourse);
    }
    public static Comparator<Student> compareByCourses(){
         return Comparator.comparing(Student::getCourse).thenComparing(Student::getName);

    }
    @Override
    public String toString(){
        return (getName()+":"+getCourse());
    }
}