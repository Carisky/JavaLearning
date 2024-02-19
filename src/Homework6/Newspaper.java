package src.Homework6;

import java.util.List;

public class Newspaper extends Publication {
    private final String issueDate;
    private final List<String> headlines;

    public Newspaper(String title, String issueDate, List<String> headlines) {
        super(title);
        this.issueDate = issueDate;
        this.headlines = headlines;
    }

    @Override
    public void displayInfo() {
        System.out.println("Newspaper: " + title);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Headlines:");
        for (String headline : headlines) {
            System.out.println("- " + headline);
        }
        System.out.println("-----------------------------");
    }

    @Override
    public String getAuthor() {
        return null;
    }
}
