package src.Homework6;

import java.util.List;

class Anthology extends Publication {
    private final List<Book> works;

    public Anthology(String title, List<Book> works) {
        super(title);
        this.works = works;
    }

    @Override
    public void displayInfo() {
        System.out.println("Anthology: " + title);
        System.out.println("Works in the Anthology:");
        for (Book work : works) {
            System.out.println("- " + work.title + " by " + work.getAuthor());
        }
        System.out.println("-----------------------------");
    }

    @Override
    public String getAuthor() {
        return null;
    }
}
