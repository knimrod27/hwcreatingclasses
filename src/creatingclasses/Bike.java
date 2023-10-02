package creatingclasses;

import java.util.Objects;

public class Bike {
    private final String type;
    private final int price;

    public Bike(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return price == bike.price && Objects.equals(type, bike.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
