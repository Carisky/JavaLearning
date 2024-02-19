package src.Homework7;

import src.Homework7.Enums.Brand;
import src.Homework7.Enums.PowerState;
import src.Homework7.Exceptions.ConsoleInactiveException;
import src.Homework7.Interfaces.Powered;

class GameConsole implements Powered {
    private final Brand brand;
    private final String serial;
    private final Gamepad firstGamepad;
    private final Gamepad secondGamepad;
    private PowerState isOn;
    private Game activeGame;
    private int waitingCounter;

    public GameConsole(Brand brand, String serial) {
        this.brand = brand;
        this.serial = serial;
        this.firstGamepad = new Gamepad(brand, 1);
        this.secondGamepad = new Gamepad(brand, 2);
        this.isOn = PowerState.OFF;
        this.activeGame = null;
        this.waitingCounter = 0;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getSerial() {
        return serial;
    }

    public PowerState getIsOn() {
        return isOn;
    }

    public Gamepad getFirstGamepad() {
        return firstGamepad;
    }

    public Gamepad getSecondGamepad() {
        return secondGamepad;
    }

    public Game getActiveGame() {
        return activeGame;
    }

    @Override
    public void powerOn() {
        isOn = PowerState.ON;
    }

    @Override
    public void powerOff() {
        isOn = PowerState.OFF;
    }

    public void loadGame(Game game) {
        activeGame = game;
        System.out.println("Игра " + game.getName() + " загружается");
    }

    public void playGame() {
        if (isOn == PowerState.OFF) {
            throw new IllegalStateException("Консоль выключена");
        }

        checkStatus();

        if (activeGame != null) {
            System.out.println("Играем в " + activeGame.getName());
            decreaseChargeLevel(firstGamepad);
            decreaseChargeLevel(secondGamepad);
        } else {
            System.out.println("Выберите игру для начала игры");
        }
    }

    private void checkStatus() {
        if (firstGamepad.getIsOn() == PowerState.ON || secondGamepad.getIsOn() == PowerState.ON) {
            waitingCounter = 0;
        } else {
            waitingCounter++;
            if (waitingCounter > 5) {
                powerOff();
                throw new ConsoleInactiveException("Приставка завершает работу из-за отсутствия активности");
            } else {
                System.out.println("Подключите джойстик");
            }
        }
    }

    private void decreaseChargeLevel(Gamepad gamepad) {
        double currentCharge = gamepad.getChargeLevel();
        if (currentCharge > 0) {
            gamepad.setChargeLevel(currentCharge - 10.0);
        } else {
            gamepad.turnOff();
        }
    }
}
