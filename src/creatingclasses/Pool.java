package creatingclasses;

import java.util.Objects;

public class Pool {
    private final int waterAmount;
    private final int depth;

    public int getWaterAmount() {
        return waterAmount;
    }

    public int getDepth() {
        return depth;
    }

    public Pool(int waterAmount, int depth) {
        this.waterAmount = waterAmount;
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pool pool = (Pool) o;
        return waterAmount == pool.waterAmount && depth == pool.depth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(waterAmount, depth);
    }

    @Override
    public String toString() {
        return "Pool{" +
                "waterAmount=" + waterAmount +
                ", depth=" + depth +
                '}';
    }
}
