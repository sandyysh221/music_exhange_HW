package Instruments;

import Behaviours.IPlay;

public class Drums extends Instruments implements IPlay {
    private int numberOfPieces;

    public Drums(String name, String brand, InstrumentTypes instrumentTypes, int numberOfPieces) {
        super(name, brand, instrumentTypes);
        this.numberOfPieces = numberOfPieces;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public String play() {
        return "Ba dum tss";
    }
}
