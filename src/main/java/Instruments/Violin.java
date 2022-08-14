package Instruments;

import Behaviours.IPlay;

public class Violin extends Instruments implements IPlay {

    private int numberOfStrings;

    public Violin(String name, String brand, InstrumentTypes instrumentTypes, int numberOfStrings) {
        super(name, brand, instrumentTypes);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "Zing zing zing";
    }
}
