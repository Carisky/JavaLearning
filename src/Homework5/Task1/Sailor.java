package src.Homework5.Task1;

class Sailor extends Human {
    String sailingExperience;

    public Sailor(String name, int age, String gender, String sailingExperience) {
        super(name, age, gender);
        this.sailingExperience = sailingExperience;
    }

    public void sail() {
        System.out.println(name + " is a sailor with " + sailingExperience + " of sailing experience. They are sailing.");
    }
}
