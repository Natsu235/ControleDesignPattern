package com.tactfactory.designpattern.controle.entity.food;

import com.tactfactory.designpattern.controle.entity.food.Accompaniment;

public class AccompanimentFries extends Accompaniment {

    public AccompanimentFries() {}

    public AccompanimentFries(String size) {
        this.setName("Frites");

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
                System.err.println("AccompanimentFriesException : new size");
                break;
        }
    }

}
