package com.apex.model;

import java.io.Serializable;

public class Stat implements Serializable, Comparable<Stat> {

    private StatName name;
    private int value;

    Stat(StatName name, int value) {
        this.name = name;
        this.value = value;
    }

    public StatName getName() {
        return name;
    }

    public void setName(StatName name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Stat{" +
                "name=" + name +
                ", value=" + value +
                '}';
    }

    @Override
    public int compareTo(Stat o) {
        return Integer.compare(value, o.getValue());
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Stat) {
            Stat other = (Stat) o;
            return name.equals(other.getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getValue();
        return result;
    }

    enum StatName {
        MORALE, COMBAT, SEAFARING
    }
}
