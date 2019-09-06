package com.apex.model;

import java.io.Serializable;

import static com.apex.model.Stat.StatName;
import static com.apex.model.Stat.StatName.*;

public class Person implements Serializable {
    private int id;
    private String name;
    private int level;
    private Stat morale;
    private Stat combat;
    private Stat seafaring;
    private Trait trait;
    private boolean available;

    public Person(int id, String name, int level, int morale, int combat,
                  int seafaring, Trait trait, boolean available) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.morale = new Stat(MORALE, morale);
        this.combat = new Stat(COMBAT, combat);
        this.seafaring = new Stat(SEAFARING, seafaring);
        this.trait = trait;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Stat getMorale() {
        return morale;
    }

    public void setMorale(int morale) {
        this.morale.setValue(morale);
    }

    public Stat getCombat() {
        return combat;
    }

    public void setCombat(int combat) {
        this.combat.setValue(combat);
    }

    public Stat getSeafaring() {
        return seafaring;
    }

    public void setSeafaring(int seafaring) {
        this.seafaring.setValue(seafaring);
    }

    public Trait getTrait() {
        return trait;
    }

    public void setTrait(Trait trait) {
        this.trait = trait;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getStatValue(StatName statName) {
        switch (statName) {
            case MORALE:
                return morale.getValue();
            case COMBAT:
                return combat.getValue();
            case SEAFARING:
                return seafaring.getValue();
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", morale=" + morale +
                ", combat=" + combat +
                ", seafaring=" + seafaring +
                ", trait=" + trait +
                ", available=" + available +
                '}';
    }
}
