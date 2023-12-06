abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public void displayInfo() {
        System.out.println("Feathers: " + feathers);
        System.out.println("Lays Eggs: " + layEggs);
    }
}

class FlyingBird extends Bird {
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Ця пташка летить.");
    }
}

class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Ця пташка не летить.");
    }
}

class Eagle extends FlyingBird {
    public Eagle() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("Орел піднімається на висоту.");
    }
}

class Swallow extends FlyingBird {
    public Swallow() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("Ластівка стрімко летить.");
    }
}

class Penguin extends NonFlyingBird {
    public Penguin() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("Пінгвін не летить.");
    }
}

class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("Ківі є нелетючою пташкою.");
    }
}

