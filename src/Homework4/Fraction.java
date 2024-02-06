package src.Homework4;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        setDenominator(denominator);
    }

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public void inputFraction() {
        Scanner scanner = new Scanner(System.in);
    
        try {
            System.out.print("Enter numerator: ");
            numerator = scanner.nextInt();
    
            System.out.print("Enter denominator: ");
            int inputDenominator = scanner.nextInt();
            setDenominator(inputDenominator);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers for numerator and denominator.");
        }
    }
    

    public void outputFraction() {
        System.out.println("Fraction: " + numerator + "/" + denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("Denominator cannot be zero. Setting it to 1.");
            this.denominator = 1;
        }
    }

    public Fraction add(Fraction other) {
        int resultNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int resultDenominator = this.denominator * other.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction subtract(Fraction other) {
        int resultNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int resultDenominator = this.denominator * other.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction multiply(Fraction other) {
        int resultNumerator = this.numerator * other.numerator;
        int resultDenominator = this.denominator * other.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction divide(Fraction other) {
        try {
            if (other.numerator == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            int resultNumerator = this.numerator * other.denominator;
            int resultDenominator = this.denominator * other.numerator;
            return new Fraction(resultNumerator, resultDenominator);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction();
        fraction1.inputFraction();

        Fraction fraction2 = new Fraction();
        fraction2.inputFraction();

        System.out.println("\nFraction 1:");
        fraction1.outputFraction();

        System.out.println("\nFraction 2:");
        fraction2.outputFraction();

        System.out.println("\nSum of fractions:");
        Fraction sum = fraction1.add(fraction2);
        if (sum != null) {
            sum.outputFraction();
        }

        System.out.println("\nDifference of fractions:");
        Fraction difference = fraction1.subtract(fraction2);
        if (difference != null) {
            difference.outputFraction();
        }

        System.out.println("\nProduct of fractions:");
        Fraction product = fraction1.multiply(fraction2);
        if (product != null) {
            product.outputFraction();
        }

        System.out.println("\nQuotient of fractions:");
        Fraction quotient = fraction1.divide(fraction2);
        if (quotient != null) {
            quotient.outputFraction();
        }
    }
}
