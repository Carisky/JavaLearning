package src.Homework5.Task4;

class Kettle extends Device {
    public Kettle(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " whistles when boiling water.");
    }

    @Override
    public void desc() {
        System.out.println("This is a " + name + " used for boiling water.");
    }
}
