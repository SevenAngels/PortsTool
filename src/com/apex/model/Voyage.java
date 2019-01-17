package com.apex.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Voyage implements Serializable {

    private int id;
    private String name;
    private ArrayList<Stat> requirements;

    public Voyage(int id, String name, ArrayList<Stat> requirements) {
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

    public ArrayList<Stat> getRequirements() {
        return requirements;
    }

    public void setRequirements(ArrayList<Stat> requirements) {
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
