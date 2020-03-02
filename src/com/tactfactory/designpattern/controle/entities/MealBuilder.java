package com.tactfactory.designpattern.controle.entities;

public class MealBuilder {
	private Meal meal = Meal.getMeal();
	
	public Meal addItem(Item item) {
		this.meal.addItem(item);
		return meal;
	}
}
