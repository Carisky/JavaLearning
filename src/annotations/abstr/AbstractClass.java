package src.annotations.abstr;

public abstract class AbstractClass {

    private String name;

    public AbstractClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println(name);
    }

    public abstract void rename();
    public abstract void send();

}
