package Instruments;

import Behaviours.IPlay;

public class Drums extends Instruments implements IPlay {
    private int numberOfPieces;

    public Drums(String name, String brand, InstrumentTypes instrumentTypes, int numberOfPieces, double buyingPrice, double sellingPrice) {
        super(name, brand, instrumentTypes, buyingPrice, sellingPrice);
        this.numberOfPieces = numberOfPieces;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public String play() {
        return "Ba dum tss";
    }
}
