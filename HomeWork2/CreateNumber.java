package HomeWork2;
import java.util.Scanner;

public class CreateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] digits = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Введите цифру " + (i + 1) + ": ");
            digits[i] = scanner.nextInt();
        }

        scanner.close();

        int resultNumber = 0;
        for (int i = 0; i < 3; i++) {
            resultNumber = resultNumber * 10 + digits[i];
        }

        System.out.println("Результат: " + resultNumber);
    }
}