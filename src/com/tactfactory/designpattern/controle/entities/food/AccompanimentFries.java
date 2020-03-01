package com.tactfactory.designpattern.controle.entities.food;

public class AccompanimentFries extends Accompaniment {
	public AccompanimentFries() {
		//Silence is golden..
	}
	
	public AccompanimentFries(String size) {
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
			System.err.println("Error AccompanimentFries404 : new size");
			break;
		}
	}
}
