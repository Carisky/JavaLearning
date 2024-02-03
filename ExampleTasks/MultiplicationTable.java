package ExampleTasks;

import java.util.Scanner;

public class MultiplicationTable {

    public static void ShowTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d ", i * j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ShowTable();

        scanner.close();
    }
}
