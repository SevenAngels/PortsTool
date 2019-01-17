package com.apex.model;

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private String name;
    private int level;
    private Stat morale;
    private Stat combat;
    private Stat seafaring;
    private Stat speed;
    private Trait trait;

    public Person(int id, String name, int level, int morale, int combat,
                  int seafaring, int speed, Trait trait) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.morale = new Stat(Stat.StatName.MORALE, morale);
        this.combat = new Stat(Stat.StatName.COMBAT, combat);
        this.seafaring = new Stat(Stat.StatName.SEAFARING, seafaring);
        this.speed = new Stat(Stat.StatName.SPEED, speed);
        this.trait = trait;
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

    public Stat getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed.setValue(speed);
    }

    public Trait getTrait() {
        return trait;
    }

    public void setTrait(Trait trait) {
        this.trait = trait;
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
                ", speed=" + speed +
                ", trait=" + trait +
                '}';
    }
}
