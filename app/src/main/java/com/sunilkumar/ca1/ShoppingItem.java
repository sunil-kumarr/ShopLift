package com.sunilkumar.ca1;

public class ShoppingItem {
    private String itemName;
    private Integer itemPrice;

     ShoppingItem(String name,Integer price) {
        this.itemName = name;
        this.itemPrice = price;
    }

    public String getItemName() {
        return itemName;
    }

    public Integer getItemPrice() {
        return itemPrice;
    }
}
