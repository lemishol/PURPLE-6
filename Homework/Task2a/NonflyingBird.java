package Task2a;
import Task2a.Bird;
public class NonflyingBird extends Bird{
    @Override
    public void fly(){
        System.out.println("cannot fly");
    }
}
