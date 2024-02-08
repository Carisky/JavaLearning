package src.Homework5.Task4;

class Ship extends Device {
    public Ship(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " horn blows.");
    }

    @Override
    public void desc() {
        System.out.println("This is a " + name + " used for sailing on water.");
    }
}
