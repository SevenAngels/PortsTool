package com.apex.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Trait implements Serializable {

    private int id;
    private TraitName name;
    private BigDecimal value;

    public Trait(int id, TraitName name, BigDecimal value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TraitName getName() {
        return name;
    }

    public void setName(TraitName name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public enum TraitName {
        SOLIDARITY, MERCHANT, NONE
    }
}
