package by.gsu.epamlab;

import java.util.Objects;

public class Byn implements Comparable<Byn> {
    private int value;

    public Byn() {
    }

    public Byn(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Byn{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Byn byn = (Byn) o;
        return value == byn.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public int compareTo(Byn byn) {
        return value - byn.value;
    }
}

