package src.annotations;

@About
public class Client {

    private String name;

    public Client(String name)
    {
        int oper1 = 100;

        this.name = name;
    }

    @About(value = "my test string", message="my message")
    public void setName(String name) {
        this.name = name;
    }

    @About(value = "my test string", message="my message get Name", level = 5)
    public String getName() {
        return name;
    }
}
