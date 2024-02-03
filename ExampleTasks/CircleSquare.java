package ExampleTasks;
import java.util.Scanner;
public class CircleSquare {
    
    public static Double Square(Double radius) {
        return Pov(radius,2)*3.14;
    }
    
    public static Double Pov(Double number, int pov) {
        for (int i = 1; i < pov; i++) {
            number = number * number;
        }
        return number;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус круга: ");

        Double userInput = scanner.nextDouble();

        System.out.println("Площадь круга: " + Square(userInput));

        scanner.close();
    }
}
