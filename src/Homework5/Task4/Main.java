package src.Homework5.Task4;

public class Main {
    public static void main(String[] args) {
        Kettle kettle = new Kettle("Electric Kettle");
        Microwave microwave = new Microwave("Microwave Oven");
        Car car = new Car("Sedan Car");
        Ship ship = new Ship("Cargo Ship");

        kettle.show();
        kettle.sound();
        kettle.desc();

        microwave.show();
        microwave.sound();
        microwave.desc();

        car.show();
        car.sound();
        car.desc();

        ship.show();
        ship.sound();
        ship.desc();
    }
}
