package src.Homework6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PublicationFactory {
    private final Random random = new Random();

    public Publication createRandomPublication() {
        List<String> titles = Arrays.asList("The Catcher in the Rye", "To Kill a Mockingbird", "The Times", "Great Short Stories");
        String randomTitle = titles.get(random.nextInt(titles.size()));

        if (random.nextBoolean()) {
            return createRandomBook(randomTitle);
        } else if (random.nextBoolean()) {
            return createRandomNewspaper(randomTitle);
        } else {
            return createRandomAnthology(randomTitle);
        }
    }

    private Book createRandomBook(String title) {
        List<String> authors = Arrays.asList("J.D. Salinger", "Harper Lee", "John Doe");
        String randomAuthor = authors.get(random.nextInt(authors.size()));

        List<String> genres = Arrays.asList("Fiction", "Mystery", "Sci-Fi");
        String randomGenre = genres.get(random.nextInt(genres.size()));

        int randomPageCount = random.nextInt(300) + 100;

        return new Book(title, randomAuthor, randomGenre, randomPageCount);
    }

    private Newspaper createRandomNewspaper(String title) {
        List<String> issueDates = Arrays.asList("2024-02-12", "2024-02-13", "2024-02-14");
        String randomIssueDate = issueDates.get(random.nextInt(issueDates.size()));

        List<String> headlines = Arrays.asList("Breaking News", "Sports Highlights", "Weather Forecast");
        int numberOfHeadlines = random.nextInt(5) + 1; // Random number of headlines (1-5)
        List<String> randomHeadlines = headlines.subList(0, Math.min(numberOfHeadlines, headlines.size()));

        return new Newspaper(title, randomIssueDate, randomHeadlines);
    }

    private Anthology createRandomAnthology(String title) {
        int numberOfWorks = random.nextInt(3) + 2; // Random number of works in the anthology (2-4)
        List<Book> works = new ArrayList<>();
        for (int i = 0; i < numberOfWorks; i++) {
            works.add(createRandomBook(title + " Work " + (i + 1)));
        }

        return new Anthology(title, works);
    }
}
