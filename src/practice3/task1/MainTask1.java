package src.practice3.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainTask1 {

    private static final int RANDOM_COUNT = 50;
    private static final int RANDOM_BOUND = 100;
    public static void main(String[] args) {
        List<Integer> numbers = generateRandomNumbers(RANDOM_COUNT);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение для подсчета: ");
        int userInput = scanner.nextInt();

        long evenCount = numbers.stream().filter(n -> n % 2 == 0).count();
        long oddCount = numbers.stream().filter(n -> n % 2 != 0).count();
        long zeroCount = numbers.stream().filter(n -> n == 0).count();
        long userValueCount = numbers.stream().filter(n -> n == userInput).count();

        System.out.println("Четные: " + evenCount);
        System.out.println("Нечетные: " + oddCount);
        System.out.println("Равные 0: " + zeroCount);
        System.out.println("Равные введенному пользователем: " + userValueCount);
    }

    private static List<Integer> generateRandomNumbers(int count) {
        List<Integer> randoms = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            randoms.add(rand.nextInt(RANDOM_BOUND));
        }
        return randoms;
    }
}
