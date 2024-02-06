package src.HomeWork2;

import java.util.Scanner;

public class SeasonChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер месяца (от 1 до 12): ");
        int monthNumber = scanner.nextInt();

        if (monthNumber >= 1 && monthNumber <= 12) {
            if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
                System.out.println("Winter");
            } else if (monthNumber >= 3 && monthNumber <= 5) {
                System.out.println("Spring");
            } else if (monthNumber >= 6 && monthNumber <= 8) {
                System.out.println("Summer");
            } else {
                System.out.println("Autumn");
            }
        } else {
            System.out.println("Ошибка! Введите номер месяца от 1 до 12.");
        }
        scanner.close();
    }
}
