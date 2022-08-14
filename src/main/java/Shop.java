import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getStockCount() {
        return stock.size();
    }

    public void addItemToStock(ISell item) {
        stock.add(item);
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void removeItemFromStock(ISell item) {
        stock.remove(item);
    }

    public double calculatePotentialProfit() {
        double profit = 0;
        for(ISell item : stock) {
            profit += item.calculateMarkup();
        }
        return profit;
    }

}
