package creatingclasses;

import java.util.Objects;

public class RemoteControl {
    private final int numberOfButtons;
    private final String colour;

    public RemoteControl(int numberOfButtons, String colour) {
        this.numberOfButtons = numberOfButtons;
        this.colour = colour;
    }

    public int getNumberOfButtons() {
        return numberOfButtons;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RemoteControl that = (RemoteControl) o;
        return numberOfButtons == that.numberOfButtons && Objects.equals(colour, that.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfButtons, colour);
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "numberOfButtons=" + numberOfButtons +
                ", colour='" + colour + '\'' +
                '}';
    }
}
