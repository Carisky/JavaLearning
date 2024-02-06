package src.HomeWork2;

public class LinePrinter {
    public static void main(String[] args) {
        printLine(5, 'H', "horizontal");
        printLine(3, 'V', "vertical");
    }

    public static void printLine(int length, char symbol, String direction) {
        if ("horizontal".equalsIgnoreCase(direction)) {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        } else if ("vertical".equalsIgnoreCase(direction)) {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Ошибка! Некорректное направление. Используйте \"horizontal\" или \"vertical\".");
        }
    }
}
