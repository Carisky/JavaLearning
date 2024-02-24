package src.Homework8.Task3;

import java.util.ArrayList;
import java.util.List;

public class MainTask3 {
    public static void main(String[] args) {
        List<Device> devices = new ArrayList<>();
        devices.add(new Device("Phone", 2022, 1000.0, "Black", "Smartphone"));
        devices.add(new Device("Laptop", 2020, 1500.0, "Silver", "Laptop"));
        devices.add(new Device("Tablet", 2021, 800.0, "White", "Tablet"));
        devices.add(new Device("TV", 2019, 2000.0, "Black", "TV"));

        System.out.println("All devices:");
        devices.forEach(device -> System.out.println(device.getName()));

        String specifiedColor = "Black";
        System.out.println("\nDevices of color '" + specifiedColor + "':");
        devices.stream()
                .filter(device -> device.getColor().equalsIgnoreCase(specifiedColor))
                .forEach(device -> System.out.println(device.getName()));

        int specifiedYear = 2021;
        System.out.println("\nDevices of release year " + specifiedYear + ":");
        devices.stream()
                .filter(device -> device.getYear() == specifiedYear)
                .forEach(device -> System.out.println(device.getName()));

        double specifiedPrice = 1200.0;
        System.out.println("\nDevices more expensive than " + specifiedPrice + ":");
        devices.stream()
                .filter(device -> device.getPrice() > specifiedPrice)
                .forEach(device -> System.out.println(device.getName()));

        String specifiedType = "Tablet";
        System.out.println("\nDevices of type '" + specifiedType + "':");
        devices.stream()
                .filter(device -> device.getType().equalsIgnoreCase(specifiedType))
                .forEach(device -> System.out.println(device.getName()));

        // Show devices with release year in a specified range
        int startYear = 2018;
        int endYear = 2022;
        System.out.println("\nDevices with release year from " + startYear + " to " + endYear + ":");
        devices.stream()
                .filter(device -> device.getYear() >= startYear && device.getYear() <= endYear)
                .forEach(device -> System.out.println(device.getName()));
    }
}
