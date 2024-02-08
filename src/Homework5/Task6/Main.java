package src.Homework5.Task6;

public class Main {
    public static void main(String[] args) {
        int[] arrayElements = {5, 10, 15, 20, 25};
        Array array = new Array(arrayElements);

        System.out.println("Maximum: " + array.max());
        System.out.println("Minimum: " + array.min());
        System.out.println("Average: " + array.avg());
    }
}
