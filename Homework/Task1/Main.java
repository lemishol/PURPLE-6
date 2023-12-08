package Task1;
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Artem", 2004);
        Person person2 = new Person("Oleg", 2005);
        Person person3 = new Person("Maksym", 2000);
        Person person4 = new Person("Vad", 1990);
        Person person5 = new Person("Vlada", 2008);
        person4.changeName("Vlad");
        person1.input("Loves videogames");
        person2.input("Loves music");
        person3.input("Loves watching films");
        person4.input("Loves drinking alcohol");
        person5.input("Loves painting");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
    }
}
