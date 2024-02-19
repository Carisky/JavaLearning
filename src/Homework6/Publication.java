package src.Homework6;

public abstract class Publication {
    protected String title;
    protected String author;

    public Publication(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public Publication(String title){
        this.title = title;
    }
    public abstract void displayInfo();

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
