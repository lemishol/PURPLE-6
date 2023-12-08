package Task1;

public class Person {
    private String name;
    private int birthYear;
    private static final int currentYear = 2023;
    private String information;
    public Person(){}
    public Person(String name, int birthYear){
        this.name=name;
        this.birthYear=birthYear;
    }
    public String getName(){
        return this.name;
    }
    public int getBirthYear() {
        return this.birthYear;
    }
    public int age(){
        return currentYear-this.birthYear;
    }
    public void input(String info){
        this.information=info;
    }
    public String output(){
        return this.information;
    }
    public void changeName(String newName){
        this.name = newName;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + this.age() + ", information=" + this.output() + "]";
    }
}
