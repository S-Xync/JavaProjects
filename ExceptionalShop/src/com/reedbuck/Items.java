package com.reedbuck;

/**
 * Created by saikumar on 25/8/16 at 2:04 PM.
 */
public class Items {
    private int itemCode;
    private String itemName;
    private double unitPrice;
    private int stockRemaining;
    private int itemLimit;

    public Items(int itemCode, String itemName, double unitPrice, int stockRemaining, int itemLimit) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.stockRemaining = stockRemaining;
        this.itemLimit = itemLimit;
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemCode=" + itemCode +
                ", itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", stockRemaining=" + stockRemaining +
                ", itemLimit=" + itemLimit +
                '}';
    }

    public int getItemCode() {
        return itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getStockRemaining() {
        return stockRemaining;
    }

    public int getItemLimit() {
        return itemLimit;
    }

    public void setStockRemaining(int stockRemaining) {
        this.stockRemaining = stockRemaining;
    }
}
