package main;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map persoMap = new HashMap<String, String>();
        persoMap.put("Clarkson", "Jeremy");
        persoMap.put("May", "James");
        persoMap.put("Hammond", "Richard");
        persoMap.put("Rorty", "Richard");
        persoMap.put("Arrendt", "Hannah");
        persoMap.put("Murakami", "Haruki");
        persoMap.put("Murakami", "Haruki");
        persoMap.put("Adorno", "Theodor");
        persoMap.put("Zuboff", "Shoshana");
        persoMap.put("Piketty", "Thomas");
        persoMap.put("Polanyi", "Karl");
        for(Object k: persoMap.keySet())
            System.out.println(persoMap.get(k));
        System.out.println();
        persoMap.remove("Clarkson");
        for(Object k: persoMap.keySet())
            System.out.println(persoMap.get(k));
    }
}