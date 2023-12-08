public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter information for Person " + (i + 1) + ":");
            people[i] = new Person();
            people[i].input();
        }

        System.out.println("Information about the people:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Person " + (i + 1) + ":");
            people[i].output();
        }
    }
}
