package Homework4;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int year;
    private String publisher;
    private String genre;
    private int pageCount;

    // Конструктор без параметров
    public Book() {
    }

    // Конструктор с параметрами
    public Book(String title, String author, int year, String publisher, String genre, int pageCount) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    // Перегруженный конструктор для создания книги с базовыми значениями
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = 0;
        this.publisher = "";
        this.genre = "";
        this.pageCount = 0;
    }

    // Метод для ввода данных о книге
    public void inputBookDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название книги: ");
        this.title = scanner.nextLine();

        System.out.print("Введите ФИО автора: ");
        this.author = scanner.nextLine();

        System.out.print("Введите год выпуска: ");
        this.year = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера после ввода числа

        System.out.print("Введите название издательства: ");
        this.publisher = scanner.nextLine();

        System.out.print("Введите жанр книги: ");
        this.genre = scanner.nextLine();

        System.out.print("Введите количество страниц: ");
        this.pageCount = scanner.nextInt();
    }

    // Перегруженный метод для ввода данных о книге с указанием только названия и автора
    public void inputBookDetails(String title, String author) {
        this.title = title;
        this.author = author;
        // Остальные поля оставим с базовыми значениями
    }

    // Метод для вывода данных о книге
    public void displayBookDetails() {
        System.out.println("Название: " + this.title);
        System.out.println("Автор: " + this.author);
        System.out.println("Год выпуска: " + this.year);
        System.out.println("Издательство: " + this.publisher);
        System.out.println("Жанр: " + this.genre);
        System.out.println("Количество страниц: " + this.pageCount);
    }

    // Геттеры и сеттеры для отдельных полей
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public static void main(String[] args) {
        // Создание объекта класса Book
        Book book1 = new Book();

        // Ввод данных о книге
        book1.inputBookDetails();

        // Вывод данных о книге
        book1.displayBookDetails();

        // Использование перегруженного метода
        Book book2 = new Book();
        book2.inputBookDetails("Программирование на Java", "Иван Иванов");
        book2.displayBookDetails();
    }
}