package src.Homework6;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LibraryCatalog libraryCatalog = new LibraryCatalog();

        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", "Fiction", 224);
        Newspaper newspaper1 = new Newspaper("The Times", "2024-02-12", List.of("Breaking News", "Sports Highlights"));
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", 281);
        Anthology anthology1 = new Anthology("Great Short Stories", List.of(book1, book2));

        libraryCatalog.addPublication(book1);
        libraryCatalog.addPublication(newspaper1);
        libraryCatalog.addPublication(book2);
        libraryCatalog.addPublication(anthology1);

        libraryCatalog.displayCatalog();

        System.out.println("Search by Title:");
        Publication foundPublication = libraryCatalog.searchByTitle("The Times");
        if (foundPublication != null) {
            foundPublication.displayInfo();
        } else {
            System.out.println("Publication not found.");
        }

        System.out.println("Search by Author:");
        List<Publication> publicationsByAuthor = libraryCatalog.searchByAuthor("J.D. Salinger");
        if (!publicationsByAuthor.isEmpty()) {
            for (Publication publication : publicationsByAuthor) {
                publication.displayInfo();
            }
        } else {
            System.out.println("No publications by this author.");
        }
    }
}
