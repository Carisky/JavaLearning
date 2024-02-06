package src.HomeWork2;

import java.util.Random;

public class ArrayStatistics {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }

        int min = array[0];
        int max = array[0];
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int value : array) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
            if (value < 0) {
                negativeCount++;
            } else if (value > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Массив случайных чисел:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println("\nМинимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Количество отрицательных элементов: " + negativeCount);
        System.out.println("Количество положительных элементов: " + positiveCount);
        System.out.println("Количество нулей: " + zeroCount);
    }
}
