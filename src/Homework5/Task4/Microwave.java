package src.Homework5.Task4;

class Microwave extends Device {
    public Microwave(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " beeps when the timer ends.");
    }

    @Override
    public void desc() {
        System.out.println("This is a " + name + " used for heating food.");
    }
}
