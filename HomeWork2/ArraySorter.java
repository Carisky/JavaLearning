package HomeWork2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {5, 2, 8, 1, 7, 3, 9, 4, 6};

        System.out.println("Исходный массив: " + Arrays.toString(array));

        System.out.println("Выберите порядок сортировки:");
        System.out.println("1. По возрастанию");
        System.out.println("2. По убыванию");

        System.out.print("Введите номер выбранного порядка сортировки: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            Arrays.sort(array);
            System.out.println("Отсортированный массив по возрастанию: " + Arrays.toString(array));
        } else if (choice == 2) {
            Arrays.sort(array);
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
            System.out.println("Отсортированный массив по убыванию: " + Arrays.toString(array));
        } else {
            System.out.println("Ошибка! Некорректный выбор порядка сортировки.");
        }

        scanner.close();
    }
}
