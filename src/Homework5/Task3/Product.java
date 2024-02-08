package src.Homework5.Task3;

class Product {
    private String name;
    private Money price;

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Product: " + name);
        price.display();
    }

    public void reducePrice(int dollars, int cents) {
        int currentDollars = price.getDollars();
        int currentCents = price.getCents();

        int newDollars = currentDollars - dollars;
        int newCents = currentCents - cents;

        if (newCents < 0) {
            newDollars -= 1;
            newCents += 100;
        }

        if (newDollars < 0) {
            System.out.println("Error: Price cannot be negative.");
        } else {
            price.setAmount(newDollars, newCents);
            System.out.println("Price reduced successfully.");
        }
    }
}
