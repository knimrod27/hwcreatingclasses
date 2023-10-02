package creatingclasses;

import java.util.Objects;

public class House {
    private final int size;
    private final int numberofRooms;
    private final int price;

    public int getSize() {
        return size;
    }

    public int getNumberofRooms() {
        return numberofRooms;
    }

    public int getPrice() {
        return price;
    }

    public House(int size, int numberofRooms, int price) {
        this.size = size;
        this.numberofRooms = numberofRooms;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return size == house.size && numberofRooms == house.numberofRooms && price == house.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, numberofRooms, price);
    }

    @Override
    public String toString() {
        return "House{" +
                "size=" + size +
                ", numberofRooms=" + numberofRooms +
                ", price=" + price +
                '}';
    }
}
