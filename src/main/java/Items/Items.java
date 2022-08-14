package Items;

import Behaviours.ISell;

public abstract class Items implements ISell {
    ItemTypes itemTypes;
    private String name;
    private double buyingPrice;
    private double sellingPrice;

    public Items(ItemTypes itemTypes, String name, double buyingPrice, double sellingPrice) {
        this.itemTypes = itemTypes;
        this.name = name;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public ItemTypes getItemTypes() {
        return itemTypes;
    }

    public String getName() {
        return name;
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
