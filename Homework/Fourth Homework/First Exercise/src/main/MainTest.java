package main;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void union() {
        Set s1 = new HashSet<>();
        for (int i=0; i<10; i++)
            s1.add(i);
        Set s2 = new HashSet();
        for (int i=7; i<20; i++)
            s2.add(i);
        String expected = "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]";
        String actual = Main.union(s1,s2).toString();
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void intersect() {
        Set s1 = new HashSet<>();
        for (int i=0; i<10; i++)
            s1.add(i);
        Set s2 = new HashSet();
        for (int i=7; i<20; i++)
            s2.add(i);
        String expected = "[7, 8, 9]";
        String actual = Main.intersect(s1,s2).toString();
        assertEquals(expected,actual);
    }
}