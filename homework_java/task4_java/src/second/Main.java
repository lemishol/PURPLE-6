package second;
import java.util.*;

public class Main {
    public static String printMap (LinkedHashMap<String, String> map){
        StringBuilder sb = new StringBuilder();
        for(Object k: map.keySet())
            sb.append(String.format("Last Name: %s: First Name: %s \n", k, map.get(k)));
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedHashMap personMap = new LinkedHashMap<String, String>();
        personMap.put("Clarkson", "Jeremy");
        personMap.put("May", "James");
        personMap.put("Hammond", "Richard");
        personMap.put("Rorty", "Richard");
        personMap.put("Arrendt", "Hannah");
        personMap.put("Murakami", "Haruki");
        personMap.put("Adorno", "Theodor");
        personMap.put("Zuboff", "Shoshana");
        personMap.put("Piketty", "Thomas");
        personMap.put("Polanyi", "Karl");
        System.out.println(printMap(personMap));
        System.out.println();
        personMap.remove("Clarkson");
        System.out.println(printMap(personMap));
    }
}