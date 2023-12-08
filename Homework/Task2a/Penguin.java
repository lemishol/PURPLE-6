package Task2a;
import Task2a.NonflyingBird;
public class Penguin extends NonflyingBird {
    public Penguin() {
        this.feather = "black and white";
        this.layeggs = "345-515 grams";
    }

    ;

    @Override
    public String toString() {
        return "Penguin feather:" + feather + ", layeggs:" + layeggs;
    }
}