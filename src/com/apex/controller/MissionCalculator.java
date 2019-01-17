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

    }
}
