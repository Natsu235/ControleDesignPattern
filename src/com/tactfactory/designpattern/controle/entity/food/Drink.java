package com.tactfactory.designpattern.controle.entity.food;

import com.tactfactory.designpattern.controle.entity.Item;
import com.tactfactory.designpattern.controle.entity.Packing;
import com.tactfactory.designpattern.controle.entity.packing.Cup;

public abstract class Drink implements Item {

    private String size;
    private String name;
    private Packing packing = new Cup();
    private float price;

    public Drink() {}

    @Override
    public String size() { return this.size; }

    @Override
    public String name() { return this.name; }

    @Override
    public Packing packing() { return this.packing; }

    @Override
    public float price() { return this.price; }

    // Getters
    public String getSize() { return size; }
    public String getName() { return name; }
    public float getPrice() { return price; }
    public Packing getPacking() { return packing; }

    // Setters
    public void setSize(String size) {
        switch (size) {
            case "Petit":
                this.setPrice(1.80F);
                break;
            case "Moyen":
                this.setPrice(2.50F);
                break;
            case "Grand":
                this.setPrice(3.10F);
                break;
            default:
                System.err.println("DrinkException : new size");
                break;
        }
    }
    public void setName(String name) { this.name = name; }
    public void setPacking(Packing packing) { this.packing = packing; }
    public void setPrice(float price) { this.price = price; }

}
