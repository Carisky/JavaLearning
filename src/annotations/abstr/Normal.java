package src.annotations.abstr;

public class Normal {

    private String name;

    public Normal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println(name);
    }
}
