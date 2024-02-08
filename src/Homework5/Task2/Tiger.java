package src.Homework5.Task2;

class Tiger extends Animal {
    public Tiger(String name, int age) {
        super(name, age, "Tiger");
    }

    public void roam() {
        System.out.println(name + " is roaming in the jungle.");
    }
}
