package com.apex.model;

public enum Region {
    ARC(150), SKULL(350), HOOK(500), SCYTHE(750), BOWL(1000), PINCERS(1200),
    LOOP(1500), SHIELD(2100);

    Region(int base) {
        this.base = base;
    }

    private final int base;

    public int getBase() {
        return base;
    }

}
