package three.main;
import org.junit.jupiter.api.Test;
import three.student.Student;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void printList() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("James",6));
        list.add(new Student("Charlotte",2));
        String expected  =  "Name: James; Course: 6. \n" +
                "Name: Charlotte; Course: 2. \n";
        String actual = Main.printList(list);
        assertEquals(expected,actual);
    }
    @Test
    void printSortedListName(){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Charlotte",2));
        list.add(new Student("Hannah",2));
        String expected  =  "Name: Charlotte; Course: 2. \n" +
                "Name: Hannah; Course: 2. \n";
        String actual = Main.printSortedListName(list);
        assertEquals(expected,actual);
    }
    @Test
    void printSortedListCourse(){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Charlotte",2));
        list.add(new Student("Hannah",2));
        String expected  =  "Name: Charlotte; Course: 2. \n" +
                "Name: Hannah; Course: 2. \n";
        String actual = Main.printSortedListCourse(list);
        assertEquals(expected,actual);
    }
}