
import java.util.Scanner;
import java.time.Year;

public class Person {
    private String name;
    private int birthYear;

    // Default constructor  and constructor with 2 parameters
    public Person() {
    }
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for birthYear
    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    // Method to calculate age
    public int age() {
        int currentYear = Year.now().getValue();  // Assuming the current year is 2023
        return currentYear - birthYear;
    }

    // Method to input information
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter birth year: ");
        this.birthYear = scanner.nextInt();
    }

    // Method to output information
    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + age());
    }

    // Method to change the name
    public void changeName(String newName) {
        this.name = newName;
    }
}

