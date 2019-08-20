package com.apex.model;

import com.apex.model.Stat.StatName;

import java.io.Serializable;

public class Bow implements Serializable {

    private int id;
    private String name;
    private Stat stat;

    public Bow(int id, String name, Stat stat) {
        this.id = id;
        this.name = name;
        this.stat = stat;
    }

    public StatName getPrimaryStatName() {
        return stat.getName();
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

    public Stat getStat() {
        return stat;
    }

    public void setStat(Stat stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        return "Bow{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stat=" + stat +
                '}';
    }
}
