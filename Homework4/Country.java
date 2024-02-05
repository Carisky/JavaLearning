package Homework4;

import java.util.ArrayList;
import java.util.Scanner;

public class Country {
    private String countryName;
    private String continentName;
    private int population;
    private String phoneCode;
    private String capitalName;
    private ArrayList<String> cities;

    public Country(String countryName, String continentName, int population, String phoneCode, String capitalName, ArrayList<String> cities) {
        this.countryName = countryName;
        this.continentName = continentName;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capitalName = capitalName;
        this.cities = cities;
    }

    public Country() {
        this.countryName = "";
        this.continentName = "";
        this.population = 0;
        this.phoneCode = "";
        this.capitalName = "";
        this.cities = new ArrayList<String>();
    }

    public void inputCountryData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название страны: ");
        countryName = scanner.nextLine();

        System.out.print("Введите название континента: ");
        continentName = scanner.nextLine();

        System.out.print("Введите количество жителей в стране: ");
        population = scanner.nextInt();
        scanner.nextLine(); // очистка буфера после ввода числа

        System.out.print("Введите телефонный код страны: ");
        phoneCode = scanner.nextLine();

        System.out.print("Введите название столицы: ");
        capitalName = scanner.nextLine();

        cities = new ArrayList<>();
        System.out.print("Введите название городов страны (введите 'done' для завершения ввода): ");
        String cityName;
        while (!(cityName = scanner.nextLine()).equalsIgnoreCase("done")) {
            cities.add(cityName);
        }

        scanner.close();
    }

    public void printCountryData() {
        System.out.println("Название страны: " + countryName);
        System.out.println("Название континента: " + continentName);
        System.out.println("Количество жителей в стране: " + population);
        System.out.println("Телефонный код страны: " + phoneCode);
        System.out.println("Название столицы: " + capitalName);
        System.out.println("Названия городов страны: " + cities);
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public ArrayList<String> getCities() {
        return cities;
    }

    public void setCities(ArrayList<String> cities) {
        this.cities = cities;
    }

    public static void main(String[] args) {
        Country country = new Country("", "", 0, "", "", new ArrayList<>());
        country.inputCountryData();
        System.out.println("\nВведенные данные о стране:");
        country.printCountryData();
    }
}
