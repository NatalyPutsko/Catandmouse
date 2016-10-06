package Javalearning;

public class Kotic extends Animal {

    public void eat() {
    }

    @Override
    public void golos() {
        System.out.println("Miay");
    }

    public void move() {
        System.out.println("Go");
    }

    public static int weight;
    public static float nextWeight = 21.3f;

    @Override
    public String toString() {
        return "I'm a cat.My name is: " + this.name + ", my weight is: " + this.weight;
    }

    public Kotic() {
        this.name = "Kotic";
    }

    public Kotic(String s) {
        this.name = s;


    }
}