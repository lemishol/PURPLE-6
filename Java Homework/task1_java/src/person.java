import java.util.Scanner;
public class person {
    private String name;
    private int birthYear;
    public person() {
    }
    public person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public int age() {
        int currentYear = 2023;
        return currentYear - birthYear;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter birth year: ");
        this.birthYear = scanner.nextInt();
    }
    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + age());
    }
    public void changeName(String newName) {
        this.name = newName;
    }
}
