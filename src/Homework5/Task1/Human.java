package src.Homework5.Task1;

class Human {
    String name;
    int age;
    String gender;

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + ". I am " + age + " years old and I am a " + gender + ".");
    }
}
