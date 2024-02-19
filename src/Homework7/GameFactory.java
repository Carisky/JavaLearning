package src.Homework7;

import src.Homework7.Enums.Genre;

import java.util.Random;

public class GameFactory {
    private static final Random random = new Random();

    public Game.GameDisk createRandomPhysicalGame() {
        String name = "Game" + (random.nextInt(100) + 1);
        Genre genre = Genre.values()[random.nextInt(Genre.values().length)];
        String description = "Description" + (random.nextInt(100) + 1);
        return Game.getDisk(name, genre, description);
    }

    // Метод для создания объекта VirtualGame с случайными значениями
    public Game.VirtualGame createRandomVirtualGame() {
        String name = "VirtualGame" + (random.nextInt(100) + 1);
        Genre genre = Genre.values()[random.nextInt(Genre.values().length)];
        return Game.getVirtualGame(name, genre);
    }

    public Game.GameDisk[] createRandomPhysicalGamesArray(int count) {
        Game.GameDisk[] games = new Game.GameDisk[count];
        for (int i = 0; i < count; i++) {
            games[i] = createRandomPhysicalGame();
        }
        return games;
    }

    public Game.VirtualGame[] createRandomVirtualGamesArray(int count) {
        Game.VirtualGame[] games = new Game.VirtualGame[count];
        for (int i = 0; i < count; i++) {
            games[i] = createRandomVirtualGame();
        }
        return games;
    }
}
