package com.johnson;

public class Item {
    private int quantity;
    private String itemName;
    private double price;
    private Category category;
    private boolean importedItem;
    private ShoppingReceipt salesTax;

    public Item() {}

    public Item(int quantity, String itemName, double price, Category category, Boolean importedItem) {
        this.quantity = quantity;
        this.itemName = itemName;
        this.price = price;
        this.category = category;
        this.importedItem = importedItem;
    }

    public ShoppingReceipt getSalesTax() {
        return this.salesTax;
    }
    public void setSalesTax(ShoppingReceipt salesTax) {
        this.salesTax = salesTax;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isImportedItem() {
        return importedItem;
    }
    public void setImportedItem(boolean importedItem) {
        this.importedItem = importedItem;
    }


}
