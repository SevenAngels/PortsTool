package com.apex.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Ship implements Serializable {
    private int id;
    private String name;
    private Captain captain;
    private ArrayList<CrewMember> crew;
    private Bow bow;
    private Hull hull;
    private DeckItem deckItem1;
    private DeckItem deckItem2;
    private Rudder rudder;

    public Ship(int id, Captain captain, ArrayList<CrewMember> crew,
                Bow bow, Hull hull, DeckItem deckItem1, DeckItem deckItem2, Rudder rudder) {
        this.id = id;
        this.name = name;
        this.captain = captain;
        this.crew = crew;
        this.bow = bow;
        this.hull = hull;
        this.deckItem1 = deckItem1;
        this.deckItem2 = deckItem2;
        this.rudder = rudder;
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

    public Captain getCaptain() {
        return captain;
    }

    public void setCaptain(Captain captain) {
        this.captain = captain;
    }

    public ArrayList<CrewMember> getCrew() {
        return crew;
    }

    public void setCrew(ArrayList<CrewMember> crew) {
        this.crew = crew;
    }

    public Bow getBow() {
        return bow;
    }

    public void setBow(Bow bow) {
        this.bow = bow;
    }

    public Hull getHull() {
        return hull;
    }

    public void setHull(Hull hull) {
        this.hull = hull;
    }

    public DeckItem getDeckItem1() {
        return deckItem1;
    }

    public void setDeckItem1(DeckItem deckItem1) {
        this.deckItem1 = deckItem1;
    }

    public DeckItem getDeckItem2() {
        return deckItem2;
    }

    public void setDeckItem2(DeckItem deckItem2) {
        this.deckItem2 = deckItem2;
    }

    public Rudder getRudder() {
        return rudder;
    }

    public void setRudder(Rudder rudder) {
        this.rudder = rudder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ship ship = (Ship) o;

        if (getId() != ship.getId()) return false;
        if (!getCaptain().equals(ship.getCaptain())) return false;
        if (!getCrew().equals(ship.getCrew())) return false;
        if (!getBow().equals(ship.getBow())) return false;
        if (!getHull().equals(ship.getHull())) return false;
        if (!getDeckItem1().equals(ship.getDeckItem1())) return false;
        if (!getDeckItem2().equals(ship.getDeckItem2())) return false;
        return getRudder().equals(ship.getRudder());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getCaptain().hashCode();
        result = 31 * result + getCrew().hashCode();
        result = 31 * result + getBow().hashCode();
        result = 31 * result + getHull().hashCode();
        result = 31 * result + getDeckItem1().hashCode();
        result = 31 * result + getDeckItem2().hashCode();
        result = 31 * result + getRudder().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", captain=" + captain +
                ", crew=" + crew +
                ", bow=" + bow +
                ", hull=" + hull +
                ", deckItem1=" + deckItem1 +
                ", deckItem2=" + deckItem2 +
                ", rudder=" + rudder +
                '}';
    }
}
