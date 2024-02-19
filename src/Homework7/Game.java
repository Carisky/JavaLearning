package src.Homework7;

import src.Homework7.Enums.Genre;
import src.Homework7.Enums.Type;

public class Game {
    private final String name;
    private final Genre genre;
    private final Type type;

    private Game(String name, Genre genre, Type type) {
        this.name = name;
        this.genre = genre;
        this.type = type;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }

    public Type getType() {
        return type;
    }

    public static GameDisk getDisk(String name, Genre genre, String description) {
        return new GameDisk(name, genre, description);
    }

    public static VirtualGame getVirtualGame(String name, Genre genre) {
        return new VirtualGame(name, genre);
    }

    static class GameDisk {
        private final String description;
        private final Game data;

        private GameDisk(String name, Genre genre, String description) {
            this.description = description;
            this.data = new Game(name, genre, Type.PHYSICAL);
        }

        public String getDescription() {
            return description;
        }

        public Game getData() {
            return data;
        }
    }

    static class VirtualGame {
        private int rating;
        private final Game data;

        private VirtualGame(String name, Genre genre) {
            this.rating = 0;
            this.data = new Game(name, genre, Type.VIRTUAL);
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public Game getData() {
            return data;
        }
    }
}