package Instruments;

import Behaviours.IPlay;

public class Trumpet extends Instruments implements IPlay {

    private int numberOfValves;

    public Trumpet(String name, String brand, InstrumentTypes instrumentTypes, int numberOfValves, double buyingPrice, double sellingPrice) {
        super(name, brand, instrumentTypes, buyingPrice, sellingPrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play() {
        return "Pah-pa-ra";
    }
}
