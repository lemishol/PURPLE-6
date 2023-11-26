package main;

import birds.*;

public class Main {
    public static void main(String[] args) {
        Bird[] array = {new Eagle(), new Swallow(), new Penguin(), new Kiwi()};
        for (Bird i:array)
            i.fly();

    }
}