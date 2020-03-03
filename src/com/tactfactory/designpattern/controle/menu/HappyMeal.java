package com.tactfactory.designpattern.controle.menu;

public class HappyMeal extends Menu {

    public HappyMeal() {}

    public HappyMeal(String burger, String accompaniment, String drink, String toy) {
        this.setSize("Petit");
        this.setName("Happy Meal");
        this.setPrice(6F);

        this.setBurger1(burger);
        this.setBurger2(null);
        this.setAccompaniment(accompaniment);
        this.setDrink(drink);
        this.setGame(Math.random() < 0.5 ? "Jeu de société" : "Jeu de course");
    }

}
