package student;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private Integer course;
    public Student(String name, Integer course){
        this.name=name;
        this.course=course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }
    public String printStudents(List<Student> students, Integer course){
        Iterator i = students.iterator();
        StringBuilder result = new StringBuilder("Students in " + course + " course are: ");
        while(i.hasNext()){
            result.append((String) i.next()+",");
        }
        return result.replace(result.length()-1,result.length(),".").toString() ;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Course: " + this.course;
    }
}
