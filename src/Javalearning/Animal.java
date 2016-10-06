package Javalearning;

public abstract class Animal extends Object implements Moveble {
    protected boolean isHungry = true;
    protected String name;

    public void eat() {
        isHungry = false;
        System.out.println("Niam");
    }

    public void status() {
        if (isHungry == true) {
            System.out.println();
        }
    }

    public abstract void golos();

    public abstract void move();

}

