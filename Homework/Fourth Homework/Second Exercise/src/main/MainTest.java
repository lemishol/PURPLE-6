package main;

import java.util.LinkedHashMap;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void printMap() {
        LinkedHashMap personMap = new LinkedHashMap<String, String>();
        personMap.put("Clarkson", "Jeremy");
        personMap.put("May", "James");
        String expected = "Last Name: Clarkson: First Name: Jeremy \n" +
                "Last Name: May: First Name: James \n";
        String actual = Main.printMap(personMap);
        assertEquals(expected,actual);
    }
}