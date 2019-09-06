package com.apex.model;

import java.io.Serializable;
import java.util.List;

public class SearchSpace implements Serializable {
    private List<Captain> captains;
    private List<CrewMember> crew;
    private List<Bow> bows;
    private List<DeckItem> deckItems;
    private List<Hull> hulls;

    public SearchSpace() {
    }

    public List<Captain> getCaptains() {
        return captains;
    }

    public void setCaptains(List<Captain> captains) {
        this.captains = captains;
    }

    public List<CrewMember> getCrew() {
        return crew;
    }

    public void setCrew(List<CrewMember> crew) {
        this.crew = crew;
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

    @Override
    public String toString() {
        return "SearchSpace{" +
                "captains=" + captains +
                ", crew=" + crew +
                ", bows=" + bows +
                ", deckItems=" + deckItems +
                ", hulls=" + hulls +
                '}';
    }
}
