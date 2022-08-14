package Instruments;

import Behaviours.ISell;

public abstract class Instruments implements ISell {
    private String name;
    private String brand;
    InstrumentTypes instrumentTypes;
    private double buyingPrice;
    private double sellingPrice;

    public Instruments(String name, String brand, InstrumentTypes instrumentTypes, double buyingPrice, double sellingPrice) {
        this.name = name;
        this.brand = brand;
        this.instrumentTypes = instrumentTypes;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public InstrumentTypes getInstrumentTypes() {
        return instrumentTypes;
    }

    public double getBoughtPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkup() {
        return getSellingPrice() - getBoughtPrice();
    }
}
