package src.practice3.task2;

import java.util.List;
import java.util.Scanner;

public class MainTask2 {
    public static void main(String[] args) {
        List<String> cities = List.of("Киев", "Харьков", "Львов", "Ивано-Франковск", "Чернигов");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название города: ");
        String userCity = scanner.nextLine();

        System.out.println("Все города: " + cities);
        System.out.println("Города длиннее 6 символов: " + cities.stream().filter(city -> city.length() > 6).toList());
        System.out.println("Количество введенного города: " + cities.stream().filter(city -> city.equals(userCity)).count());
        System.out.println("Города, начинающиеся на 'М': " + cities.stream().filter(city -> city.startsWith("М")).toList());
    }
}
