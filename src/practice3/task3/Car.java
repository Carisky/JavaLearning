package src.practice3.task3;

public class Car {
    String name;
    int year;
    double price;
    String color;
    double engine_value;

    public Car (String name, int year, double price, String color, double engine_value) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.color = color;
        this.engine_value = engine_value;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public double getEngine_value() {
        return engine_value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name:'" + name + '\'' +
                ", year:" + year +
                ", price:" + price +
                ", color:'" + color + '\'' +
                ", engine_value:" + engine_value +
                '}';
    }
}

