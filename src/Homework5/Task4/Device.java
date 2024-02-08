package src.Homework5.Task4;

class Device {
    String name;

    public Device(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println(name + " makes a sound.");
    }

    public void show() {
        System.out.println("Device: " + name);
    }

    public void desc() {
        System.out.println("This is a " + name + ".");
    }
}
