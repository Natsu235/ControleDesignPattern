package com.tactfactory.designpattern.controle.factory;

import com.tactfactory.designpattern.controle.menu.BestOf;
import com.tactfactory.designpattern.controle.menu.HappyMeal;
import com.tactfactory.designpattern.controle.menu.MaxiBestOf;
import com.tactfactory.designpattern.controle.menu.McRoyale;
import com.tactfactory.designpattern.controle.menu.Menu;

public class MenuFactory {

	// Créer le menu
	public Menu create(String menu, String burger1, String burger2, String complement, String drink, String toy) {

		switch (menu) {
			case "Happy Meal":
				return new HappyMeal(burger1, complement, drink, toy);
			case "Best Of":
				return new BestOf(burger1, complement, drink);
			case "Maxi Best Of":
				return new MaxiBestOf(burger1, complement, drink);
			case "Mc Deluxe":
				return new McRoyale(burger1, burger2, complement, drink);
			default:
				return null;
		}
	}

}
