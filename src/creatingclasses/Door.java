package creatingclasses;

import java.util.Objects;

public class Door {
    private final String colour;
    private final int size;

    public Door(String colour, int size) {
        this.colour = colour;
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return size == door.size && Objects.equals(colour, door.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, size);
    }

    @Override
    public String toString() {
        return "Door{" +
                "colour='" + colour + '\'' +
                ", size=" + size +
                '}';
    }
}
