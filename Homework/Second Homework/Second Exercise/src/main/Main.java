package main;

import employee.*;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Employee [] array = {new SalariedEmployee("James", "bc-148", "1673456", 15, 300),
                new ContractEmployee("Charlotte", "bc-132", "9349240", 30000),
                new ContractEmployee("Miami", "bc-186", "209348", 25000),
                new SalariedEmployee("Jeremy", "bc-148", "1673456", 12, 250)};
        for (Employee e:array)
            System.out.println(e.toString());
        System.out.println("\n\n");
        ArrayList<Employee> list = new ArrayList<>();
        Collections.addAll(list,array);
        list.sort(new PayComparator());
        for (Employee e:list)
            System.out.println(e.toString());



    }
}