package src.Homework5.Task2;

class Kangaroo extends Animal {
    public Kangaroo(String name, int age) {
        super(name, age, "Kangaroo");
    }

    public void jump() {
        System.out.println(name + " is jumping around.");
    }
}
