package com.tactfactory.designpattern.controle.entity.food;

public class DrinkFanta extends Drink {

    public DrinkFanta() {}

    public DrinkFanta(String size) {
        this.setName("Fanta");

        switch (size) {
            case "Petit":
                this.setPrice(1.80F);
                break;
            case "Moyen":
                this.setPrice(2.50F);
                break;
            case "Grand":
                this.setPrice(3.10F);
                break;
            default:
                System.err.println("DrinkFantaException : new size");
                break;
        }
    }

}
