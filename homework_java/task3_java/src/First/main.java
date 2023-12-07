package First;
import java.util.*;
import java.util.TreeSet;

public class main {
    public static Set union(Set set1, Set set2){
        Set set3 = new TreeSet();
        set3.addAll(set1);
        set3.addAll(set2);
        return set3;
    }
    public static Set intersect(Set set1, Set set2){
        Set set3 = new HashSet();
        for (Object i:set1)
            for (Object ii:set2)
                if(i.equals(ii))
                    set3.add(i);

        return set3;
    }
    public static void main(String[] args) {
        Set s1 = new HashSet<>();
        for (int i=0; i<10; i++)
            s1.add(i);
        Set s2 = new HashSet();
        for (int i=7; i<20; i++)
            s2.add(i);
        System.out.println(union(s1,s2));
        System.out.println(intersect(s1,s2));

    }
}