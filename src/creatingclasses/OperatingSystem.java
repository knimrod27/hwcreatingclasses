package creatingclasses;

import java.util.Objects;

public class OperatingSystem {
    private final String type;
    private final int numberOfUsers;

    public String getType() {
        return type;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public OperatingSystem(String type, int numberOfUsers) {
        this.type = type;
        this.numberOfUsers = numberOfUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperatingSystem that = (OperatingSystem) o;
        return numberOfUsers == that.numberOfUsers && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, numberOfUsers);
    }

    @Override
    public String toString() {
        return "OperatingSystem{" +
                "type='" + type + '\'' +
                ", numberOfUsers=" + numberOfUsers +
                '}';
    }
}
