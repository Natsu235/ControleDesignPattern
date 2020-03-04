package com.tactfactory.designpattern.controle.menu;

public class HappyMeal extends Menu {

    public HappyMeal() {}

    public HappyMeal(String burger, String accompaniment, String drink, String game) {
        this.setSize("Petit");
        this.setName("Happy Meal");
        this.setPrice(6F);

        this.setBurger1(burger);
        this.setAccompaniment(accompaniment);
        this.setDrink(drink);
        this.setGame(game);
    }

}
