package com.apex.controller;


import com.apex.model.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.apex.model.Trait.TraitName;
import static java.math.RoundingMode.HALF_UP;

public class MissionCalculator {

    private static final BigDecimal MIN_CREW_STAT_RATIO = new BigDecimal("0.05");
    private static final boolean MERCHANT_ENABLED = true;

    private Voyage voyage;
    private List<CrewMember> crewRoster;
    private List<Captain> captains;
    private List<Bow> bows;
    private List<DeckItem> deckItems;
    private List<Hull> hulls;

    public MissionCalculator(Voyage voyage, List<CrewMember> crewRoster,
                             List<Captain> captains, List<Bow> bows,
                             List<DeckItem> deckItems, List<Hull> hulls) {
        this.voyage = voyage;
        this.crewRoster = crewRoster;
        this.captains = captains;
        this.bows = bows;
        this.deckItems = deckItems;
        this.hulls = hulls;
    }

    public Ship findOptimalShip() {
        SearchSpace searchSpace = optimizeSearchSpace();

        return new Ship(1,
                captains.get(0),
                crewRoster,
                bows.get(0),
                hulls.get(0),
                deckItems.get(0),
                deckItems.get(0));
    }

    private SearchSpace optimizeSearchSpace() {
        SearchSpace searchSpace;
        int numReqs = voyage.getRequirements().size();
        switch (numReqs) {
            case 1:
                throw new UnsupportedOperationException("Optimal strategy is trivial");
            case 2:
                searchSpace = optimizeTwoStats();
                break;
            case 3:
                searchSpace = optimizeThreeStats();
                break;
            default: throw new IllegalArgumentException("Invalid voyage - unexpected number of reqs");
        }

        return searchSpace;
    }

    private SearchSpace optimizeTwoStats() {

        List<Stat> voyageRequirements = voyage.getRequirements();
        
        //Captain search space
        List<Captain> searchCaptains = new ArrayList<>();
        for (Captain captain : captains) {
            if (voyageRequirements.contains(captain.getPrimaryStat())) {
                searchCaptains.add(captain);
            }
        }
        if (searchCaptains.isEmpty()) {
            Captain highestLevel = captains.get(0);
            for (Captain captain : captains) {
                if(captain.getLevel() > highestLevel.getLevel()) {
                    highestLevel = captain;
                }
            }
            searchCaptains.add(highestLevel);
        }

        //Crew search space
        List<CrewMember> searchCrew = new ArrayList<>();

        for (CrewMember crewMember : crewRoster) {
            TraitName traitName = crewMember.getTrait().getName();
            if (traitName == TraitName.SOLIDARITY || (traitName == TraitName.MERCHANT && MERCHANT_ENABLED)) {
                searchCrew.add(crewMember);
            }
            for (Stat statReq : voyageRequirements) {
                if (statReq.getValue() > 0) {
                    BigDecimal crewStatValue = new BigDecimal(crewMember.getStatValue(statReq.getName()));
                    BigDecimal voyageStatValue = new BigDecimal(statReq.getValue());
                    if (crewStatValue.divide(voyageStatValue, HALF_UP).compareTo(MIN_CREW_STAT_RATIO) > 0) {
                        searchCrew.add(crewMember);
                    }
                }
            }
        }

        //Ship item search space
        List<Bow> searchBows = new ArrayList<>();

        for (Bow bow : bows) {
            if (voyageRequirements.contains(bow.getStat())) {
                searchBows.add(bow);
            }
        }

        List<DeckItem> searchDeckItems = new ArrayList<>();

        for (DeckItem deckItem : deckItems) {
            if (voyageRequirements.contains(deckItem.getStat())) {
                searchDeckItems.add(deckItem);
            }
        }

        List<Hull> searchHulls = new ArrayList<>();

        for (Hull hull : hulls) {
            if (voyageRequirements.contains(hull.getPrimaryStat())) {
                searchHulls.add(hull);
            }
        }

        SearchSpace searchSpace = new SearchSpace();
        searchSpace.setCaptains(searchCaptains);
        searchSpace.setCrew(searchCrew);
        searchSpace.setBows(searchBows);
        searchSpace.setDeckItems(searchDeckItems);
        searchSpace.setHulls(searchHulls);
        return searchSpace;
    }

    private SearchSpace optimizeThreeStats() {
        return new SearchSpace();
    }

    public Voyage getVoyage() {
        return voyage;
    }

    public void setVoyage(Voyage voyage) {
        this.voyage = voyage;
    }

    public List<CrewMember> getCrewRoster() {
        return crewRoster;
    }

    public void setCrewRoster(List<CrewMember> crewRoster) {
        this.crewRoster = crewRoster;
    }

    public List<Captain> getCaptains() {
        return captains;
    }

    public void setCaptains(List<Captain> captains) {
        this.captains = captains;
    }

    public List<Bow> getBows() {
        return bows;
    }

    public void setBows(List<Bow> bows) {
        this.bows = bows;
    }

    public List<DeckItem> getDeckItems() {
        return deckItems;
    }

    public void setDeckItems(List<DeckItem> deckItems) {
        this.deckItems = deckItems;
    }

    public List<Hull> getHulls() {
        return hulls;
    }

    public void setHulls(List<Hull> hulls) {
        this.hulls = hulls;
    }
}
