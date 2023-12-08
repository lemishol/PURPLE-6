package Task2a;
import Task2a.FlyingBird;
public class Swallow extends FlyingBird {
    public Swallow() {
        this.feather = "blue and white";
        this.layeggs = "2 grams";
    }

    ;

    @Override
    public String toString() {
        return "Swallow feather:" + feather + ", layeggs:" + layeggs;
    }
}