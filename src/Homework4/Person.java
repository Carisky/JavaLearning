package src.Homework4;
import java.util.Scanner;

public class Person {
    private String fullName;
    private String birthDate;
    private String contactNumber;
    private String city;
    private String country;
    private String homeAddress;

    public Person(String fullName, String birthDate, String contactNumber, String city, String country, String homeAddress) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.contactNumber = contactNumber;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
    }

    public Person() {
        this.fullName = "";
        this.birthDate = "";
        this.contactNumber = "";
        this.city = "";
        this.country = "";
        this.homeAddress = "";
    }

    public void inputPersonData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        fullName = scanner.nextLine();

        System.out.print("Введите дату рождения: ");
        birthDate = scanner.nextLine();

        System.out.print("Введите контактный телефон: ");
        contactNumber = scanner.nextLine();

        System.out.print("Введите город: ");
        city = scanner.nextLine();

        System.out.print("Введите страну: ");
        country = scanner.nextLine();

        System.out.print("Введите домашний адрес: ");
        homeAddress = scanner.nextLine();
        scanner.close();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName + "\n" +
               "Дата рождения: " + birthDate + "\n" +
               "Контактный телефон: " + contactNumber + "\n" +
               "Город: " + city + "\n" +
               "Страна: " + country + "\n" +
               "Домашний адрес: " + homeAddress;
    }

    public static void main(String[] args) {
        Person person = new Person("", "", "", "", "", "");
        person.inputPersonData();
        System.out.println("\nВведенные данные о человеке:");
        System.out.println(person);
    }
}
