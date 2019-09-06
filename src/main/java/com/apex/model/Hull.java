package com.apex.model;

import com.apex.model.Stat.StatName;

import java.io.Serializable;
import java.util.ArrayList;

public class Hull implements Serializable {

    private int id;
    private String name;
    private Stat morale;
    private Stat combat;
    private Stat seafaring;
    private Stat speed;

    public Hull(int id, String name, int morale, int combat, int seafaring) {
        this.id = id;
        this.name = name;
        this.morale = new Stat(StatName.MORALE, morale);
        this.combat = new Stat(StatName.COMBAT, combat);
        this.seafaring = new Stat(StatName.SEAFARING, seafaring);
    }

    public Stat getPrimaryStat() {
        Stat primary = morale;
        ArrayList<Stat> stats = new ArrayList<>();
        stats.add(morale);
        stats.add(combat);
        stats.add(seafaring);
        for (Stat stat : stats) {
            if (stat.getValue() < primary.getValue()) {
                primary = stat;
            }
        }
        return primary;
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

    public Stat getMorale() {
        return morale;
    }

    public void setMorale(Stat morale) {
        this.morale = morale;
    }

    public Stat getCombat() {
        return combat;
    }

    public void setCombat(Stat combat) {
        this.combat = combat;
    }

    public Stat getSeafaring() {
        return seafaring;
    }

    public void setSeafaring(Stat seafaring) {
        this.seafaring = seafaring;
    }

    public Stat getSpeed() {
        return speed;
    }

    public void setSpeed(Stat speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Hull{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", morale=" + morale +
                ", combat=" + combat +
                ", seafaring=" + seafaring +
                ", speed=" + speed +
                '}';
    }
}
