package com.apex;

import com.apex.model.*;

import java.io.Serializable;
import java.util.ArrayList;

public class Port implements Serializable {
    private Region region;
    private int shipSlots;
    private ArrayList<CrewMember> crewRoster;
    private ArrayList<Captain> captains;
    private ArrayList<Bow> bows;
    private ArrayList<Hull> hulls;
    private ArrayList<DeckItem> deckItems;
    private ArrayList<Rudder> rudders;

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public int getShipSlots() {
        return shipSlots;
    }

    public void setShipSlots(int shipSlots) {
        this.shipSlots = shipSlots;
    }

    public ArrayList<CrewMember> getCrewRoster() {
        return crewRoster;
    }

    public void setCrewRoster(ArrayList<CrewMember> crewRoster) {
        this.crewRoster = crewRoster;
    }

    public ArrayList<Captain> getCaptains() {
        return captains;
    }

    public void setCaptains(ArrayList<Captain> captains) {
        this.captains = captains;
    }

    public ArrayList<Bow> getBows() {
        return bows;
    }

    public void setBows(ArrayList<Bow> bows) {
        this.bows = bows;
    }

    public ArrayList<Hull> getHulls() {
        return hulls;
    }

    public void setHulls(ArrayList<Hull> hulls) {
        this.hulls = hulls;
    }

    public ArrayList<DeckItem> getDeckItems() {
        return deckItems;
    }

    public void setDeckItems(ArrayList<DeckItem> deckItems) {
        this.deckItems = deckItems;
    }

    public ArrayList<Rudder> getRudders() {
        return rudders;
    }

    public void setRudders(ArrayList<Rudder> rudders) {
        this.rudders = rudders;
    }
}
