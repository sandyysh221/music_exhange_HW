package Instruments;

import Behaviours.IPlay;

public class Violin extends Instruments implements IPlay {

    private int numberOfStrings;

    public Violin(String name, String brand, InstrumentTypes instrumentTypes, int numberOfStrings, double buyingPrice, double sellingPrice) {
        super(name, brand, instrumentTypes, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "Zing zing zing";
    }
}
