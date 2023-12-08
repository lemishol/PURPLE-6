package Task4a;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void intersection() {
        HashSet<String> set1 = new HashSet<>();
        set1.add("dog");
        set1.add("fox");
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(1);
        TreeSet<String> set3 = new TreeSet<>();
        set3.add("dog");
        String expected1 = "[]";
        String actual1 = (Main.intersection(set1, set2)).toString();
        String expected2 = "[dog]";
        String actual2 = (Main.intersection(set1, set3)).toString();
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    void union() {
        HashSet<String> set1 = new HashSet<>();
        set1.add("dog");
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(54);
        TreeSet<String> set3 = new TreeSet<>();
        set3.add("fox");
        String expected1 = "[dog, 54]";
        String actual1 = (Main.union(set1, set2)).toString();
        String expected2 = "[dog, fox]";
        String actual2 = (Main.union(set1, set3)).toString();
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }
}