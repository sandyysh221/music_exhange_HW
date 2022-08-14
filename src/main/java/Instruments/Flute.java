package Instruments;

import Behaviours.IPlay;

public class Flute extends Instruments implements IPlay {

    private int numberOfToneHoles;

    public Flute(String name, String brand, InstrumentTypes instrumentTypes, int numberOfToneHoles, double buyingPrice, double sellingPrice) {
        super(name, brand, instrumentTypes, buyingPrice, sellingPrice);
        this.numberOfToneHoles = numberOfToneHoles;
    }

    public int getNumberOfToneHoles() {
        return numberOfToneHoles;
    }

    public String play() {
        return "Tootle ti toot";
    }
}
