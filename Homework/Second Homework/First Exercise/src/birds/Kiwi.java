package birds;

public class Kiwi extends NonflyingBirds{
    @Override
    public void fly() {
        System.out.println("Kiwis are unable to fly.");
    }
}
