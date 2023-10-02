package creatingclasses;

import java.util.Objects;

public class File {
    private final int size;
    private final String name;

    public File(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return size == file.size && Objects.equals(name, file.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, name);
    }

    @Override
    public String toString() {
        return "File{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
