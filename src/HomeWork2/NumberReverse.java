package src.HomeWork2;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите шестизначное число: ");
        int number = scanner.nextInt();

        if (number >= 100000 && number <= 999999) {
            int digit1 = number / 100000 % 10;
            int digit2 = number / 10000 % 10;
            int digit3 = number / 1000 % 10;
            int digit4 = number / 100 % 10;
            int digit5 = number / 10 % 10;
            int digit6 = number % 10;

            int newNumber = digit6 * 100000 + digit2 * 10000 + digit3 * 1000
                           + digit4 * 100 + digit5 * 10 + digit1;

            System.out.println("Исходное число: " + number);
            System.out.println("Преобразованное число: " + newNumber);
        } else {
            System.out.println("Ошибка! Введите шестизначное число.");
        }
        scanner.close();
    }
}
