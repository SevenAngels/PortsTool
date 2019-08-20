package com.apex.model;

public class Rudder {

    private int id;
    private String name;
    private Stat speed;

    public Rudder(int id, String name, int speed) {
        this.id = id;
        this.name = name;
        this.speed = new Stat(Stat.StatName.SPEED, speed);
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

    public Stat getSpeed() {
        return speed;
    }

    public void setSpeed(Stat speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Rudder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
