package src.practice3.Task4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainTask4 {
    public static void main(String[] args) {
        List<TV> TVs = Arrays.asList(
                new TV("Samsung QLED", 2021, 1500.0, 55.0, "Samsung"),
                new TV("LG OLED", 2020, 1800.0, 65.0, "LG"),
                new TV("Sony Bravia", 2022, 2000.0, 60.0, "Sony"),
                new TV("Panasonic Viera", 2019, 1200.0, 50.0, "Panasonic"),
                new TV("TCL 4K", 2021, 1000.0, 55.0, "TCL"),
                new TV("Vizio Quantum", 2022, 1700.0, 75.0, "Vizio")
        );

        System.out.println("Введите цену телевизора для фильтрации: ");
        Scanner scan = new Scanner(System.in);
        double user_price = scan.nextDouble();

        System.out.println("Все телевизоры: " + TVs);
        System.out.println("Телевизоры с заданной диагональю: " + TVs.stream().filter(t -> t.getDiagonal() == 55.0).toList());
        System.out.println("Телевизоры от определенного производителя: " + TVs.stream().filter(t -> t.getManufacturer().equals("Samsung")).toList());
        System.out.println("Телевизоры текущего года: " + TVs.stream().filter(t -> t.getYear() == 2024).toList());
        System.out.println("Телевизоры дороже определенной цены: " + TVs.stream().filter(t -> t.getPrice() > user_price).toList());
        System.out.println("Телевизоры отсортированные по цене по возрастанию: " + TVs.stream().sorted(Comparator.comparingDouble(TV::getPrice)).toList());
        System.out.println("Телевизоры отсортированные по цене по убыванию: " + TVs.stream().sorted((t1, t2) -> Double.compare(t2.getPrice(), t1.getPrice())).toList());
        System.out.println("Телевизоры отсортированные по диагонали по возрастанию: " + TVs.stream().sorted(Comparator.comparingDouble(TV::getDiagonal)).toList());
        System.out.println("Телевизоры отсортированные по диагонали по убыванию: " + TVs.stream().sorted((t1, t2) -> Double.compare(t2.getDiagonal(), t1.getDiagonal())).toList());
    }
}
