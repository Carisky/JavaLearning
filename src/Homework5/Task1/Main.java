package src.Homework5.Task1;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder("John", 30, "Male", "Carpentry");
        Sailor sailor = new Sailor("Anna", 25, "Female", "5 years");
        Pilot pilot = new Pilot("Mike", 35, "Male", "10 years");

        builder.introduce();
        builder.build();

        sailor.introduce();
        sailor.sail();

        pilot.introduce();
        pilot.fly();
    }

}