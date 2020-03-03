package com.tactfactory.designpattern.controle.menu;

public class McRoyale extends Menu {

	public McRoyale() {}

	public McRoyale(String burger1, String burger2, String accompaniment, String drink) {
		this.setSize("Grand");
		this.setName("Mc Royale");
		this.setPrice(11F);

		this.setBurger1(burger1);
		this.setBurger2(burger2);
		this.setAccompaniment(accompaniment);
		this.setDrink(drink);
	}

}
