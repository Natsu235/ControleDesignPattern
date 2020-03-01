package com.tactfactory.designpattern.controle.entities.food;

import com.tactfactory.designpattern.controle.entities.Item;
import com.tactfactory.designpattern.controle.entities.Packing;
import com.tactfactory.designpattern.controle.entities.packing.Cornet;

public class Accompaniment implements Item {
	private String name;
	private float price;
	private String size;
	private Packing packing = new Cornet();

	@Override
	public String name() {
		return this.name;
	}

	@Override
	public Packing packing() {
		return this.packing;
	}

	@Override
	public float price() {
		return this.price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		switch (size) {
		case "petit":
			setSize(size) ; 
			setPrice((float) 1.80);
			break;	
		case "moyen":
			setSize(size) ; 
			setPrice((float) 2.50);
			break;	
		case "grand":
			setSize(size) ; 
			break;
		default:
			System.err.println("Error Accompaniment404 : size");
			break;
		}
	}

	public Packing getPacking() {
		return packing;
	}

	public void setPacking(Packing packing) {
		this.packing = packing;
	}
}
