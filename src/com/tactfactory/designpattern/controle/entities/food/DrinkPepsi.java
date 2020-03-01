package com.tactfactory.designpattern.controle.entities.food;

public class DrinkPepsi extends Drink {
	public DrinkPepsi() {
		//Silence is golden..
	}
	
	public DrinkPepsi(String size) {
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
