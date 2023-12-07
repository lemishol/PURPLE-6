import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
        person[] people = new person[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter information for Person " + (i + 1) + ":");
            people[i] = new person();
            people[i].input();
        }
        System.out.println("Information about the people:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Person " + (i + 1) + ":");
            people[i].output();
        }
    }
}