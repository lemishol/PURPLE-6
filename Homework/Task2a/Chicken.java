package Task2a;
import Task2a.NonflyingBird;
public class Chicken extends NonflyingBird {
    public Chicken() {
        this.feather = "white";
        this.layeggs = "50-70 grams";
    }

    ;

    @Override
    public String toString() {
        return "Chicken feather:" + feather + ", layeggs:" + layeggs;
    }
}