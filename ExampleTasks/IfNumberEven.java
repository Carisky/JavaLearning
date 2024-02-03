package ExampleTasks;

import java.util.Scanner;

public class IfNumberEven {
    public static Boolean isNumberEven(int input) {
        if(input%2==1){
            return false;
        }else return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");

        int userInput = scanner.nextInt();

        if (isNumberEven(userInput)) {
            System.out.println("чётное");
        } else {
            System.out.println("не чётное");
        }

        scanner.close();
    }
}
