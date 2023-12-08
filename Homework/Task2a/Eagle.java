package Task2a;
import Task2a.FlyingBird;
public class Eagle extends FlyingBird{
    public Eagle() {
        this.feather="brown and white";
        this.layeggs="110-130 grams";
    };
    @Override
    public String toString() {
        return "Eagle feather:" + feather + ", layeggs:" + layeggs;
    }
}
