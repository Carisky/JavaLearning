package src.practice3.task3;

import java.util.List;
import java.util.Scanner;

public class MainTask3 {
    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("Toyota Camry", 2020, 25000.0, "Синий", 2.5),
                new Car("Honda Accord", 2019, 22000.0, "Красный", 2.0)
        );

        System.out.println("Введите цвет автомобиля для фильтрации: ");
        Scanner scan = new Scanner(System.in);
        String user_color = scan.nextLine();

        System.out.println("Все автомобили: " + cars);
        System.out.println("Автомобили заданного цвета: " + cars.stream().filter(a -> a.getColor().equals(user_color)).toList());
        System.out.println("Автомобили заданного объема: " + cars.stream().filter(a -> a.getEngine_value() == 2.5).toList());
        System.out.println("Автомобили дороже заданной цены: " + cars.stream().filter(a -> a.getPrice() > 23000.0).toList());
        System.out.println("Автомобили по году выпуска в диапазоне 2018-2022: " + cars.stream().filter(a -> a.getYear() >= 2018 && a.getYear() <= 2022).toList());
    }
}
