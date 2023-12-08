package Task4b;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void ifTwoAndMoreSameFirstNames() {
        Map<String, String> personMap1 = new LinkedHashMap<>();
        personMap1.put("Rudyk", "Artem");
        personMap1.put("Savchuk", "Artem");
        Map<String, String> personMap2 = new LinkedHashMap<>();
        personMap2.put("Rudyk", "Artem");
        personMap2.put("Savchuk", "Vlad");
        boolean expected1 = true;
        boolean actual1 = Main.ifTwoAndMoreSameFirstNames(personMap1);
        boolean expected2 = false;
        boolean actual2 = Main.ifTwoAndMoreSameFirstNames(personMap2);
        assertEquals(expected1, actual1);
        assertEquals(expected2, expected2);
    }

    @Test
    void removePersonByFirstName() {
        Map<String, String> personMap = new LinkedHashMap<>();
        personMap.put("Rudyk", "Artem");
        String expected = "{}";
        String actual = Main.removePersonByFirstName(personMap, "Artem");
        assertEquals(expected, actual);
    }
}