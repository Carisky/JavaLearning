package HomeWork2;

import java.util.Random;

public class SeparateArrays {
    public static void main(String[] args) {
        int[] originalArray = new int[10]; 
        Random random = new Random();
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = random.nextInt(21) - 10;
        }

        int[] evenArray = new int[originalArray.length];
        int evenCount = 0;

        int[] oddArray = new int[originalArray.length];
        int oddCount = 0;

        int[] negativeArray = new int[originalArray.length];
        int negativeCount = 0;

        int[] positiveArray = new int[originalArray.length];
        int positiveCount = 0;

        for (int value : originalArray) {
            if (value % 2 == 0) {
                evenArray[evenCount++] = value;
            }
            else {
                oddArray[oddCount++] = value;
            }
            if (value < 0) {
                negativeArray[negativeCount++] = value;
            }
            else if (value > 0) {
                positiveArray[positiveCount++] = value;
            }
        }

        System.out.println("Исходный массив:");
        for (int value : originalArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nМассив четных чисел:");
        printArray(evenArray, evenCount);
        System.out.println("Массив нечетных чисел:");
        printArray(oddArray, oddCount);
        System.out.println("Массив отрицательных чисел:");
        printArray(negativeArray, negativeCount);
        System.out.println("Массив положительных чисел:");
        printArray(positiveArray, positiveCount);
    }

    private static void printArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
