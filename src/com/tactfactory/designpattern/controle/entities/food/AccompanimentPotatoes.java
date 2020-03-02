package com.tactfactory.designpattern.controle.entities.food;

public class AccompanimentPotatoes extends Accompaniment {
	public AccompanimentPotatoes() {
		//Silence is golden..
	}
	
	public AccompanimentPotatoes(String size) {
		setName("Potatoes");
		
		switch (size) {
		case "petit":
			setPrice((float) 1.80);
			break;	
		case "moyen": 
			setPrice((float) 2.50);
			break;	
		case "grand":
			setPrice((float) 3.10);
			break;

		default:
			System.err.println("Error AccompanimentPotatoes404 : new size");
			break;
		}
	}
}
