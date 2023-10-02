package creatingclasses;

import java.util.Objects;

public class Flashlight {
    private final int levelOfBrightness;
    private final String size;

    public int getLevelOfBrightness() {
        return levelOfBrightness;
    }

    public Flashlight(int levelOfBrightness, String size) {
        this.levelOfBrightness = levelOfBrightness;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flashlight that = (Flashlight) o;
        return levelOfBrightness == that.levelOfBrightness && Objects.equals(size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(levelOfBrightness, size);
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Flashlight{" +
                "levelOfBrightness=" + levelOfBrightness +
                ", size='" + size + '\'' +
                '}';
    }
}

