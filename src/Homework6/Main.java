package src.Homework6;

import src.Homework6.catalog.LibraryCatalog;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        LibraryCatalog libraryCatalog = new LibraryCatalog();
        PublicationFactory publicationFactory = new PublicationFactory();

        for (int i = 0; i < 7; i++) {
            libraryCatalog.addPublication(publicationFactory.createRandomPublication());
        }
        libraryCatalog.displayCatalog();

        System.out.println("Search by Title:");
        Publication foundPublication = libraryCatalog.searchByTitle("The Times");
        foundPublication.displayInfo();

        System.out.println("Search by Author:");
        List<Publication> publicationsByAuthor = libraryCatalog.searchByAuthor("J.. Salinger");
            for (Publication publication : publicationsByAuthor) {
                publication.displayInfo();
            }
    }
}
