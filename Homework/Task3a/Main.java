package Task3a;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static <T, U> Set<Object> intersection(Set<T> set1, Set<U> set2) {
        Set<Object> result = new HashSet<>();
        for (T element : set1) {
            for (U otherElement : set2) {
                if (element.equals(otherElement)) {
                    result.add(element);
                }
            }
        }
        return result;
    }
    public static <T, U> Set<Object> union(Set<T> set1, Set<U> set2) {
            Set<Object> result = new HashSet<>(set1);
            result.addAll(set2);
            return result;
        }
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("dog");
        set1.add("fox");
        set1.add("cat");
        set1.add("bear");
        TreeSet<String> set2 = new TreeSet<>();
        set2.add("bear");
        set2.add("2");
        set2.add("4");
        set2.add("54");
        Set<Object> intersectionSet = intersection(set1, set2);
        Set<Object> unionSet = union(set1, set2);
        System.out.println(intersectionSet);
        System.out.println(unionSet);
    }
}
