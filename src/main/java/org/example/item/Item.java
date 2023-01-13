package org.example.item;


import java.util.UUID;

public class Item {

    private final UUID id;
    private final double price;
    private final int quantity;
    private final ProductType productType;

    public Item(int price, int quantity, ProductType productType) {
        this.productType = productType;
        this.id = UUID.randomUUID();
        this.price = price;
        this.quantity = quantity;
    }

    public ProductType getProductType() {return productType;}

    public UUID getId() {return id;}

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}


