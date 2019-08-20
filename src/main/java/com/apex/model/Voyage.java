package com.apex.model;

import java.io.Serializable;
import java.util.List;

public class Voyage implements Serializable {

    private int id;
    private String name;
    private List<Stat> requirements;

    public Voyage(int id, String name, List<Stat> requirements) {
        this.id = id;
        this.name = name;
        this.requirements = requirements;
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

    public List<Stat> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<Stat> requirements) {
        this.requirements = requirements;
    }

    @Override
    public String toString() {
        return "Voyage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", requirements=" + requirements +
                '}';
    }
}
