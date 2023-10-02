package creatingclasses;

import java.util.Objects;

public class Telephone {
    private final String brand;
    private final int screenType;

    public Telephone(String brand, int screenType) {
        this.brand = brand;
        this.screenType = screenType;
    }

    public String getBrand() {
        return brand;
    }

    public int getScreenType() {
        return screenType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telephone telephone = (Telephone) o;
        return screenType == telephone.screenType && Objects.equals(brand, telephone.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, screenType);
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "brand='" + brand + '\'' +
                ", screenType=" + screenType +
                '}';
    }
}
