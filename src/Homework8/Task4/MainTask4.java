package src.Homework8.Task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainTask4 {
    public static void main(String[] args) {
        List<Projector> projectors = new ArrayList<>();
        projectors.add(new Projector("Epson 123", 2022, 1500.0, "Epson"));
        projectors.add(new Projector("Sony XYZ", 2021, 1200.0, "Sony"));
        projectors.add(new Projector("LG Pro", 2022, 1800.0, "LG"));
        projectors.add(new Projector("Samsung Ultra", 2020, 2000.0, "Samsung"));

        System.out.println("All projectors:");
        projectors.forEach(projector -> System.out.println(projector.name()));

        String specifiedManufacturer = "Sony";
        System.out.println("\nProjectors from manufacturer '" + specifiedManufacturer + "':");
        projectors.stream()
                .filter(projector -> projector.manufacturer().equalsIgnoreCase(specifiedManufacturer))
                .forEach(projector -> System.out.println(projector.name()));

        int currentYear = 2022;
        System.out.println("\nProjectors of the current year (" + currentYear + "):");
        projectors.stream()
                .filter(projector -> projector.releaseYear() == currentYear)
                .forEach(projector -> System.out.println(projector.name()));

        double specifiedPrice = 1500.0;
        System.out.println("\nProjectors more expensive than " + specifiedPrice + ":");
        projectors.stream()
                .filter(projector -> projector.price() > specifiedPrice)
                .forEach(projector -> System.out.println(projector.name()));

        System.out.println("\nProjectors sorted by price in ascending order:");
        projectors.stream()
                .sorted(Comparator.comparing(Projector::price))
                .forEach(projector -> System.out.println(projector.name()));

        System.out.println("\nProjectors sorted by price in descending order:");
        projectors.stream()
                .sorted(Comparator.comparing(Projector::price).reversed())
                .forEach(projector -> System.out.println(projector.name()));

        System.out.println("\nProjectors sorted by release year in ascending order:");
        projectors.stream()
                .sorted(Comparator.comparing(Projector::releaseYear))
                .forEach(projector -> System.out.println(projector.name()));

        System.out.println("\nProjectors sorted by release year in descending order:");
        projectors.stream()
                .sorted(Comparator.comparing(Projector::releaseYear).reversed())
                .forEach(projector -> System.out.println(projector.name()));
    }
}
