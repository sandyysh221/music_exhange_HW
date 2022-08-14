package Instruments;

import Behaviours.IPlay;

public class Piano extends Instruments implements IPlay {

    private int numberOfKeys;

    public Piano(String name, String brand, InstrumentTypes instrumentTypes, int numberOfKeys) {
        super(name, brand, instrumentTypes);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play() {
        return "Plink-a-plink-a-plink";
    }
}
