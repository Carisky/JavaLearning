package src.HomeWork2;
import java.util.Scanner;
public class PercentCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение: ");
        double value = scanner.nextDouble();

        System.out.print("Введите процент: ");
        double percent = scanner.nextDouble();

        scanner.close();

        double result = (percent / 100) * value;

        System.out.println("Результат: " + result);
    }
}
