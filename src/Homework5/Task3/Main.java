package src.Homework5.Task3;

public class Main {
    public static void main(String[] args) {
        Money money = new Money(50, 75);
        Product product = new Product("Example Product", money);

        product.display();

        product.reducePrice(10, 25);

        product.display();
    }
}