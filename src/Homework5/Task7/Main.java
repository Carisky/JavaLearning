package src.Homework5.Task7;

public class Main {
    public static void main(String[] args) {
        int[] arrayElements = {5, 2, 8, 1, 9};
        Array array = new Array(arrayElements);

        System.out.println("Original array:");
        array.display();

        array.sortAsc();
        System.out.println("Sorted in ascending order:");
        array.display();

        array.sortDesc();
        System.out.println("Sorted in descending order:");
        array.display();

        
    }
}
