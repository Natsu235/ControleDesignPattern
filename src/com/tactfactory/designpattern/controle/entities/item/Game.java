package com.tactfactory.designpattern.controle.entities.item;

import com.tactfactory.designpattern.controle.entities.Item;
import com.tactfactory.designpattern.controle.entities.Packing;
import com.tactfactory.designpattern.controle.entities.packing.Box;

public class Game implements Item {

	protected String size;
	protected String name;
	private Packing packing = new Box();
    protected float price;

    public Game() {}

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

	@Override
	public String toString() {
		return "Size : " + this.getSize() + ", Name : " + this.getName() + ", Packing : " + this.getPacking() + "Price : " + this.getPrice();
	}

}
