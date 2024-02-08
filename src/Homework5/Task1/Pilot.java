package src.Homework5.Task1;

class Pilot extends Human {
    String flyingExperience;

    public Pilot(String name, int age, String gender, String flyingExperience) {
        super(name, age, gender);
        this.flyingExperience = flyingExperience;
    }

    public void fly() {
        System.out.println(name + " is a pilot with " + flyingExperience + " of flying experience. They are flying.");
    }
}
