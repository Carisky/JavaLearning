package src.Homework8.Task1;

import java.util.List;
import java.util.Random;

public class MainTask1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = random.ints(100, -100, 100)
                .boxed()
                .toList();

        long positiveCount = numbers.stream()
                .filter(num -> num > 0)
                .count();

        long negativeCount = numbers.stream()
                .filter(num -> num < 0)
                .count();

        long twoDigitCount = numbers.stream()
                .filter(num -> num >= 10 && num <= 99 || num <= -10 && num >= -99)
                .count();

        long palindromeCount = numbers.stream()
                .filter(MainTask1::isPalindrome)
                .count();

        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);
        System.out.println("Количество двухзначных чисел: " + twoDigitCount);
        System.out.println("Количество зеркальных чисел: " + palindromeCount);
    }

    private static boolean isPalindrome(int num) {
        String strNum = String.valueOf(Math.abs(num));
        return strNum.contentEquals(new StringBuilder(strNum).reverse());
    }
}
