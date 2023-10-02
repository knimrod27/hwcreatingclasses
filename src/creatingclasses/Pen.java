package creatingclasses;

import java.util.Objects;

public class Pen {
    private final String colour;
    private final int price;

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public Pen(String colour, int price) {
        this.colour = colour;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return price == pen.price && Objects.equals(colour, pen.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, price);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
