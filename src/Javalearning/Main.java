package Javalearning;


public class Main {
    public final static Kotic VASYA = new Kotic("Vasya");
    public static Kotic mursik = new Kotic("Mursic");

    public static void main(String[] args) {
        System.out.println(Kotic.nextWeight);
        Kotic.nextWeight = 22;
        System.out.println(mursik.nextWeight);
        System.out.println(VASYA.nextWeight);


    }
}
