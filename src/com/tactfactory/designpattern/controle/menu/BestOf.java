package com.tactfactory.designpattern.controle.menu;

public class BestOf extends Menu {

    public BestOf() {}

    public BestOf(String burger, String accompaniment, String drink) {
        this.setSize("Petit");
        this.setName("Best Of");
        this.setPrice(8.9F);

        this.setBurger1(burger);
        this.setAccompaniment(accompaniment);
        this.setDrink(drink);
    }

}
