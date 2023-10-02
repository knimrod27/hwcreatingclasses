package creatingclasses;

import java.util.Objects;

public class Application {
    private final String name;
    private final int size;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public Application(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Application that = (Application) o;
        return size == that.size && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
