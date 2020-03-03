package com.tactfactory.designpattern.controle.entity.food;

public class DrinkCoca extends Drink {

    public DrinkCoca() {}

    public DrinkCoca(String size) {
        this.setName("Coca Cola");

        switch (size) {
            case "Petit":
                setPrice(1.80F);
                break;
            case "Moyen":
                setPrice(2.50F);
                break;
            case "Grand":
                setPrice(3.10F);
                break;
            default:
                System.err.println("DrinkCocaException : new size");
                break;
        }
    }

}
