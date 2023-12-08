package Task4b;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class Main {
    public static boolean ifTwoAndMoreSameFirstNames(Map map){
        Set <String> measureSet = new HashSet<>();
        for (int i=0; i<map.size(); i++){
            measureSet.add(map.get(map.keySet().toArray()[i]).toString());
        }
        if (measureSet.size()!= map.size()){return true;}
        else {return false;}
    }
    public static String removePersonByFirstName(Map map, String firstName){
        for (int i=0; i<map.size(); i++){
            if (map.get(map.keySet().toArray()[i]).toString()==firstName){
                map.remove(map.keySet().toArray()[i]);
                break;
            }
        }
        return map.toString();
    }
    public static void main(String[] args) {
        Map<String, String> personMap = new LinkedHashMap<>();
        personMap.put("Rudyk", "Artem");
        personMap.put("Savchuk", "Artem");
        personMap.put("Kostenko", "Vlada");
        personMap.put("Bohun", "Andriy");
        personMap.put("Maletska", "Kate");
        personMap.put("Prytula", "Christina");
        personMap.put("Kuznecov", "Vladyslav");
        personMap.put("Shelby", "Tomas");
        personMap.put("Stone", "Samuel");
        personMap.put("Zelensky", "Volodymyr");

        System.out.println(personMap);
        System.out.println(ifTwoAndMoreSameFirstNames(personMap));
        removePersonByFirstName(personMap, "Artem");
        System.out.println(personMap);
    }
}
