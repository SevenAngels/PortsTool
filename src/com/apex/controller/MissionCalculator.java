package com.apex.controller;

import com.apex.model.*;

import java.util.ArrayList;

public class MissionCalculator {

    private Voyage voyage;
    private ArrayList<CrewMember> crewRoster;
    private ArrayList<Captain> captains;
    private ArrayList<Bow> bows;
    private ArrayList<DeckItem> deckItems;
    private ArrayList<Hull> hulls;
    private Rudder rudder;

    public MissionCalculator(Voyage voyage, ArrayList<CrewMember> crewRoster,
                             ArrayList<Captain> captains, ArrayList<Bow> bows,
                             ArrayList<DeckItem> deckItems, ArrayList<Hull> hulls,
                             Rudder rudder) {
        this.voyage = voyage;
        this.crewRoster = crewRoster;
        this.captains = captains;
        this.bows = bows;
        this.deckItems = deckItems;
        this.hulls = hulls;
        this.rudder = rudder;
    }

    public Ship findOptimalShip() {
        optimizeSearchSpace();
        return new Ship(1,
                captains.get(0),
                crewRoster,
                bows.get(0),
                hulls.get(0),
                deckItems.get(0),
                deckItems.get(0),
                rudder);
    }

    private void optimizeSearchSpace() {
    //TODO: implement search space optimization
    }

    public Voyage getVoyage() {
        return voyage;
    }

    public void setVoyage(Voyage voyage) {
        this.voyage = voyage;
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

    public Rudder getRudder() {
        return rudder;
    }

    public void setRudder(Rudder rudder) {
        this.rudder = rudder;
    }
}
