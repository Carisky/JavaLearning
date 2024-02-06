package src.Classwork;

import java.util.Scanner;

public class City {
    private String cityName;
    private String regionName;
    private String countryName;
    private int population;
    private String postalCode;
    private String phoneCode;

    public City(String cityName, String regionName, String countryName, int population, String postalCode, String phoneCode) {
        this.cityName = cityName;
        this.regionName = regionName;
        this.countryName = countryName;
        this.population = population;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }

    public City() {
        this.cityName = "";
        this.regionName = "";
        this.countryName = "";
        this.population = 0;
        this.postalCode = "";
        this.phoneCode = "";
    }

    public void inputCityData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название города: ");
        cityName = scanner.nextLine();

        System.out.print("Введите название региона: ");
        regionName = scanner.nextLine();

        System.out.print("Введите название страны: ");
        countryName = scanner.nextLine();

        System.out.print("Введите количество жителей в городе: ");
        population = scanner.nextInt();
        scanner.nextLine(); // очистка буфера после ввода числа

        System.out.print("Введите почтовый индекс города: ");
        postalCode = scanner.nextLine();

        System.out.print("Введите телефонный код города: ");
        phoneCode = scanner.nextLine();

        scanner.close();
    }

    public void printCityData() {
        System.out.println("Название города: " + cityName);
        System.out.println("Название региона: " + regionName);
        System.out.println("Название страны: " + countryName);
        System.out.println("Количество жителей в городе: " + population);
        System.out.println("Почтовый индекс города: " + postalCode);
        System.out.println("Телефонный код города: " + phoneCode);
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public static void main(String[] args) {
        City city = new City("", "", "", 0, "", "");
        city.inputCityData();
        System.out.println("\nВведенные данные о городе:");
        city.printCityData();
    }
}
