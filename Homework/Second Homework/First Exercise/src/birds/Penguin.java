package birds;

public class Penguin extends NonflyingBirds{
    @Override
    public void fly() {
        System.out.println("Penguins are unable to fly.");
    }
}
