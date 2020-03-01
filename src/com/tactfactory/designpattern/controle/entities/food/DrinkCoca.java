package com.tactfactory.designpattern.controle.entities.food;

public class DrinkCoca extends Drink{
	public DrinkCoca() {
		//Silence is golden..
	}
	
	public DrinkCoca(String size) {
		setName("Fries");
		
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
			setPrice((float) 3.10);
			break;

		default:
			System.err.println("Error DrinkPepsi404 : new size");
			break;
		}
	}
}
