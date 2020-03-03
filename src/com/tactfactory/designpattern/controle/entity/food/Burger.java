package com.tactfactory.designpattern.controle.entity.food;

import com.tactfactory.designpattern.controle.entity.packing.Box;
import com.tactfactory.designpattern.controle.entity.Item;
import com.tactfactory.designpattern.controle.entity.Packing;

public abstract class Burger implements Item {

    private String size;
    private String name;
    private Packing packing = new Box();
    private float price;

    public Burger() {}

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
    public void setSize(String size) { this.size = size; }
    public void setName(String name) { this.name = name; }
    public void setPacking(Packing packing) { this.packing = packing; }
    public void setPrice(float price) { this.price = price; }

}
