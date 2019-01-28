package com.apex.model;

import java.io.Serializable;
import java.util.ArrayList;

public class SearchSpace implements Serializable {
    private ArrayList<Captain> captains;
    private ArrayList<CrewMember> crew;
    private ArrayList<Bow> bows;
    private ArrayList<DeckItem> deckItems;
    private ArrayList<Hull> hulls;
    private ArrayList<Rudder> rudders;

    public SearchSpace() {
    }

    public ArrayList<Captain> getCaptains() {
        return captains;
    }

    public void setCaptains(ArrayList<Captain> captains) {
        this.captains = captains;
    }

    public ArrayList<CrewMember> getCrew() {
        return crew;
    }

    public void setCrew(ArrayList<CrewMember> crew) {
        this.crew = crew;
    }

    public ArrayList<Bow> getBows() {
        return bows;
    }

    public void setBows(ArrayList<Bow> bows) {
        this.bows = bows;
    }

    public ArrayList<DeckItem> getDeckItems() {
        return deckItems;
    }

    public void setDeckItems(ArrayList<DeckItem> deckItems) {
        this.deckItems = deckItems;
    }

    public ArrayList<Hull> getHulls() {
        return hulls;
    }

    public void setHulls(ArrayList<Hull> hulls) {
        this.hulls = hulls;
    }

    public ArrayList<Rudder> getRudders() {
        return rudders;
    }

    public void setRudders(ArrayList<Rudder> rudders) {
        this.rudders = rudders;
    }

    @Override
    public String toString() {
        return "SearchSpace{" +
                "captains=" + captains +
                ", crew=" + crew +
                ", bows=" + bows +
                ", deckItems=" + deckItems +
                ", hulls=" + hulls +
                ", rudders=" + rudders +
                '}';
    }
}
