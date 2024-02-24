package src.Homework8.Task2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainTask2 {
    public static void main(String[] args) {
        List<String> products = Arrays.asList("Молоко", "Хлеб", "Яблоко", "Сок", "Молоко", "Сыр", "Масло");

        System.out.println("Все продукты:");
        products.forEach(System.out::println);

        System.out.println("\nПродукты с названием меньше пяти символов:");
        products.stream()
                .filter(product -> product.length() < 5)
                .forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите название продукта для подсчета: ");
        String userProduct = scanner.nextLine();
        long count = products.stream()
                .filter(product -> product.equalsIgnoreCase(userProduct))
                .count();
        System.out.println("Продукт '" + userProduct + "' встречается " + count + " раз(а)");

        System.out.print("\nВведите букву для фильтрации по начальной букве: ");
        String initialLetter = scanner.nextLine();
        System.out.println("Продукты, начинающиеся на букву '" + initialLetter + "':");
        products.stream()
                .filter(product -> product.startsWith(initialLetter))
                .forEach(System.out::println);

        System.out.println("\nПродукты из категории 'Молоко':");
        products.stream()
                .filter(product -> product.equals("Молоко"))
                .forEach(System.out::println);

        scanner.close();
    }
}
