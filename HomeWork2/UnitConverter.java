package HomeWork2;

import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество метров: ");
        double meters = scanner.nextDouble();

        System.out.println("Выберите единицу измерения для конвертации:");
        System.out.println("1. Мили");
        System.out.println("2. Дюймы");
        System.out.println("3. Ярды");

        System.out.print("Введите номер выбранной единицы измерения: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double miles = meters * 0.000621371;
                System.out.println(meters + " метров = " + miles + " миль");
                break;
            case 2:
                double inches = meters * 39.3701;
                System.out.println(meters + " метров = " + inches + " дюймов");
                break;
            case 3:
                double yards = meters * 1.09361;
                System.out.println(meters + " метров = " + yards + " ярдов");
                break;
            default:
                System.out.println("Ошибка! Неверный выбор единицы измерения.");
        }
        scanner.close();
    }

}
