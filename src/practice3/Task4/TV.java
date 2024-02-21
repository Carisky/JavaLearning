package src.practice3.Task4;

public class TV {
    String model;
    int year;
    double price;
    double diagonal;
    String manufacturer;

    public TV(String model, int year, double price, double diagonal, String manufacturer) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "\n\n" + "TV{" +
                "model='" + model + "\n" +
                "year=" + year + "\n" +
                "price=" + price + "\n" +
                "diagonal=" + diagonal + "\n" +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }
}