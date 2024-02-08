package src.Homework5.Task2;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Stripes", 5);
        Crocodile crocodile = new Crocodile("Snappy", 8);
        Kangaroo kangaroo = new Kangaroo("Hopper", 3);

        tiger.eat();
        tiger.roam();
        tiger.makeSound();

        crocodile.sleep();
        crocodile.swim();
        crocodile.makeSound();

        kangaroo.jump();
        kangaroo.sleep();
        kangaroo.makeSound();
    }
}
