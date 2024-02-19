package src.Homework7;

import src.Homework7.Enums.Brand;

public class PlayRoom {
    public static void main(String[] args) {
        GameFactory gameFactory = new GameFactory();

        Game.GameDisk[] physicalGames = gameFactory.createRandomPhysicalGamesArray(5);

        Game.VirtualGame[] virtualGames = gameFactory.createRandomVirtualGamesArray(5);

        GameConsole gameConsole = new GameConsole(Brand.SONY, "XC123QeWR");

        for (Game.GameDisk gameDisk : physicalGames) {
            gameConsole.loadGame(gameDisk.getData());
        }

        for (Game.VirtualGame virtualGame : virtualGames) {
            gameConsole.loadGame(virtualGame.getData());
        }
    }
}