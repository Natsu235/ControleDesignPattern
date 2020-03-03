package com.tactfactory.designpattern.controle.menu;

public class MaxiBestOf extends Menu {

    public MaxiBestOf() {}

    public MaxiBestOf(String burger, String accompaniment, String drink) {
        this.setSize("Grand");
        this.setName("Maxi Best Of");
        this.setPrice(9.5F);

        this.setBurger1(burger);
        this.setBurger2(null);
        this.setAccompaniment(accompaniment);
        this.setDrink(drink);
    }

}
