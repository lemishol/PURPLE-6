package Task2b;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee("Artem", 10000, "000-123-424"),
                new SalariedEmployee("Oleg", 90, 100, "324-45-7896"),
                new SalariedEmployee("Max", 150, 100, "024-46-7190"),
                new SalariedEmployee("Andriy", 150, 10, "304-55-7896"),
                new SalariedEmployee("Kate", 200, 99, "320-45-2816"),
                new ContractEmployee("Amber", 10001, "578-003-444"),
                new ContractEmployee("Bogdan", 10020, "770-188-654"),
                new ContractEmployee("Lina", 10300, "923-333-931")
        };
        Arrays.sort(employees, new EmployeeComparator());
        for (Employee employee: employees) {
            System.out.println(employee);
            
        }
    }
}
