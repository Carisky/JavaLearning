package src.Homework5.Task2;

class Crocodile extends Animal {
    public Crocodile(String name, int age) {
        super(name, age, "Crocodile");
    }

    public void swim() {
        System.out.println(name + " is swimming in the water.");
    }
}