package com.apex.model;

public class CrewMember extends Person {

    public CrewMember(int id, String name, int level, int morale, int combat,
                      int seafaring, int speed, Trait trait) {
        super(id, name, level, morale, combat, seafaring, speed, trait, true);
    }

}
