package src.annotations;

@About(message = "It's service", level = 1)
public class Server {

    private int id;

    public Server(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
