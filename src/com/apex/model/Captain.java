package com.apex.model;

import com.apex.model.Stat.StatName;

import java.util.ArrayList;

public class Captain extends Person {

    public Captain(int id, String name, int level, int morale, int combat, int seafaring, int speed, Trait trait) {
        super(id, name, level, morale, combat, seafaring, speed, trait);
    }

    public Stat getPrimaryStat() {
        Stat primary = this.getMorale();
        ArrayList<Stat> stats = new ArrayList<>();
        stats.add(this.getMorale());
        stats.add(this.getCombat());
        stats.add(this.getSeafaring());
        for (Stat stat : stats) {
            if (stat.getValue() < primary.getValue()) {
                primary = stat;
            }
        }
        return primary;
    }
}
