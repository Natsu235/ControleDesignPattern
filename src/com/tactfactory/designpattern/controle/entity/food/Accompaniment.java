package com.tactfactory.designpattern.controle.entity.food;

import com.tactfactory.designpattern.controle.entity.Item;
import com.tactfactory.designpattern.controle.entity.Packing;
import com.tactfactory.designpattern.controle.entity.packing.Cornet;

public class Accompaniment implements Item {

    private String size;
    private String name;
    private Packing packing = new Cornet();
    private float price;

    public Accompaniment() {}

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
    public Packing getPacking() { return packing; }
    public float getPrice() { return price; }

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
                System.err.println("AccompanimentException : new size");
                break;
        }
    }
    public void setName(String name) { this.name = name; }
    public void setPacking(Packing packing) { this.packing = packing; }
    public void setPrice(float price) { this.price = price; }

}
