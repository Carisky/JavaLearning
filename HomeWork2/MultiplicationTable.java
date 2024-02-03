package HomeWork2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальное значение для таблицы умножения: ");
        int start = scanner.nextInt();

        System.out.print("Введите конечное значение для таблицы умножения: ");
        int end = scanner.nextInt();

        if (start > end) {
            System.out.println("Ошибка! Начальное значение должно быть меньше или равно конечному.");
        } else {
            for (int i = 1; i <= 10; i++) {
                for (int j = start; j <= end; j++) {
                    System.out.print(j + "*" + i + " = " + (j * i) + "\t");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
