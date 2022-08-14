package Instruments;

public abstract class Instruments {
    private String name;
    private String brand;
    InstrumentTypes instrumentTypes;

    public Instruments(String name, String brand, InstrumentTypes instrumentTypes) {
        this.name = name;
        this.brand = brand;
        this.instrumentTypes = instrumentTypes;
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
}
