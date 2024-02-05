package Homework4;

import java.util.Scanner;

public class Car {
    private String modelName;
    private String manufacturer;
    private int year;
    private double engineVolume;

    public Car() {
    }


    public Car(String modelName, String manufacturer, int year, double engineVolume) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public void inputCarData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название автомобиля: ");
        this.modelName = scanner.nextLine();

        System.out.print("Введите название производителя: ");
        this.manufacturer = scanner.nextLine();

        System.out.print("Введите год выпуска: ");
        this.year = scanner.nextInt();

        System.out.print("Введите объём двигателя: ");
        this.engineVolume = scanner.nextDouble();
    }

    public void inputCarData(String modelName, String manufacturer, int year, double engineVolume) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    // Метод для вывода данных об автомобиле
    public void displayCarData() {
        System.out.println("Название автомобиля: " + modelName);
        System.out.println("Название производителя: " + manufacturer);
        System.out.println("Год выпуска: " + year);
        System.out.println("Объём двигателя: " + engineVolume + " л");
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.inputCarData();
        System.out.println("\nДанные об автомобиле:");
        myCar.displayCarData();

        myCar.inputCarData("Мой автомобиль", "Производитель", 2022, 2.5);
        System.out.println("\nДанные об автомобиле после изменений:");
        myCar.displayCarData();
    }
}
