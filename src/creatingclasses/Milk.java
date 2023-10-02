package creatingclasses;

import java.util.Objects;

public class Milk {
    private final int expirationDate;
    private final int size;

    public Milk(int expirationDate, int size) {
        this.expirationDate = expirationDate;
        this.size = size;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Milk milk = (Milk) o;
        return expirationDate == milk.expirationDate && size == milk.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(expirationDate, size);
    }

    @Override
    public String toString() {
        return "Milk{" +
                "expirationDate=" + expirationDate +
                ", size=" + size +
                '}';
    }
}
