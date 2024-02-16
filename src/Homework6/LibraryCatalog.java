package src.Homework6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class PublicationNotFoundException extends Exception {
    public PublicationNotFoundException(String message) {
        super(message);
    }
}

class LibraryCatalog {
    private List<Publication> catalog;

    public LibraryCatalog() {
        this.catalog = new ArrayList<>();
    }

    public void addPublication(Publication publication) {
        catalog.add(publication);
    }

    public void displayCatalog() {
        System.out.println("Library Catalog:");
        for (Publication publication : catalog) {
            publication.displayInfo();
        }
    }

    public Publication searchByTitle(String title) {
        try {
            for (Publication publication : catalog) {
                if (publication.title.equals(title)) {
                    return publication;
                }
            }
            throw new PublicationNotFoundException("Publication with title '" + title + "' not found.");
        } catch (PublicationNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Publication> searchByAuthor(String author) {
        List<Publication> result = new ArrayList<>();
        try {
            for (Publication publication : catalog) {
                if (publication instanceof Book && ((Book) publication).getAuthor().equals(author)) {
                    result.add(publication);
                }
            }
            if (result.isEmpty()) {
                throw new PublicationNotFoundException("No publications found for author '" + author + "'.");
            }
            return result;
        } catch (PublicationNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
