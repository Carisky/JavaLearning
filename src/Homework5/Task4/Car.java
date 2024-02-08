package src.Homework5.Task4;

class Car extends Device {
    public Car(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " engine roars.");
    }

    @Override
    public void desc() {
        System.out.println("This is a " + name + " used for transportation.");
    }
}
