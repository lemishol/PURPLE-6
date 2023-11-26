package person;

import java.time.LocalDate;

public class Person {
    private String name;
    private int birthYear;
    public Person (String name, int birthYear){
        this.name=name;
        this.birthYear=birthYear;
    }
    public String getName(){
        return this.name;
    }
    public int getBirthYear(){
        return this.birthYear;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBirthYear(int birthYear){
        this.birthYear=birthYear;
    }
    public int age(){
        return LocalDate.now().getYear()-this.birthYear;
    }
    @Override
    public String toString(){
        return "Name: " + this.name + " Year of Birth: " + this.birthYear;
    }
}
