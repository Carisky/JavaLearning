package src.wrappers;


import java.util.Arrays;
import java.util.Scanner;
public class StringTest {
    public static void main(String[] args) {
        String literalString = "Hello, World!";

        String newString = new String("Java is fun!");

        char[] charArray = {'S', 't', 'r', 'i', 'n', 'g'};
        String charArrayString = new String(charArray);

        byte[] byteArray = {65, 66, 67, 68, 69};
        String byteArrayString = new String(byteArray);

        StringBuilder stringBuilder = new StringBuilder("StringBuilder Example");
        String stringBuilderString = stringBuilder.toString();

        System.out.println("1. Литерал: " + literalString);
        System.out.println("2. С использованием оператора new: " + newString);
        System.out.println("3. Используя массив символов: " + charArrayString);
        System.out.println("4. Из байтов: " + byteArrayString);
        System.out.println("5. С использованием StringBuilder: " + stringBuilderString);

        System.out.println("-".repeat(40));

        String fruitsString = "Апельсин,Яблоко,Гранат,Груша";
        String[] fruitsArray = fruitsString.split(",");
        String[] fruitsArrayToLower = Arrays.stream(fruitsArray).map(String::toLowerCase).toArray(String[]::new);
        String longestFruit = Arrays.stream(fruitsArray).map(String::toLowerCase).max((s1, s2) -> s1.length() - s2.length()).orElse(null);
        String longestFruitAbbraviated = longestFruit.substring(0, Math.min(longestFruit.length(), 3));
        String inputString = "   Я_новая_строка      ";
        String trimmedString = inputString.trim();
        String finalString = trimmedString.replace('_', ' ');
        System.out.println("1. Оригинальная строка " + fruitsString);
        System.out.println("2. Массив строк " + Arrays.toString(fruitsArray));
        System.out.println("3. Массив строк в нижнем регистре " + Arrays.toString(fruitsArrayToLower));
        System.out.println("4. Самое длинное название фрукта " + longestFruit);
        System.out.println("5. Сокращение самого длинного фрукта " + longestFruitAbbraviated);
        System.out.println("6. Преобразованная строка: " + inputString + " = " + finalString);
        System.out.println("7. Проверка введённой строки ");


        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");

        String userInput = scanner.nextLine();

        System.out.println("Вы ввели: " + userInput);

        if (userInput.startsWith("Запуск")) {
            System.out.println("Запускаем процесс");
        }

        if (userInput.endsWith("завершен")) {
            System.out.println("Процесс завершен");
        }

        if (userInput.toLowerCase().contains("ошибка")) {
            System.out.println("Произошла ошибка");
        }

        scanner.close();

        System.out.println("-".repeat(40));

        StringBuilder resultBuilder = new StringBuilder();

        String[] stringArray = {literalString,newString,charArrayString,byteArrayString,stringBuilderString};

        for (String str : stringArray) {
            resultBuilder.append(str+". ");
        }

        int lineCount = resultBuilder.toString().split("\\.").length;
        for (int i = 1; i <= lineCount; i++) {
            if (i % 3 == 0 && i != lineCount) {

                int index = resultBuilder.indexOf(stringArray[i-1]);
                resultBuilder.insert(index,"\n");
            }
        }
        resultBuilder.replace(0, resultBuilder.length(), resultBuilder.toString().replace(".", ""));
        String resultString = resultBuilder.toString();
        System.out.println(resultString);

    }

}
