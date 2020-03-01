package com.tactfactory.designpattern.controle.entities.food;

public class AccompanimentPotatoes extends Accompaniment {
	public AccompanimentPotatoes() {
		//Silence is golden..
	}
	
	public AccompanimentPotatoes(String size) {
		setName("Potatoes");
		
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
			System.err.println("Error AccompanimentPotatoes404 : new size");
			break;
		}
	}
}
