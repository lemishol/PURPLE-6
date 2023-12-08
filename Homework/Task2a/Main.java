package Task2a;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {new Chicken(), new Penguin(), new Eagle(), new Penguin()};
        for (int i=0; i < birds.length; i++){
            System.out.println(birds[i]);
            birds[i].fly();
        }
    }
}
