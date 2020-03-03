package com.tactfactory.designpattern.controle.entity.food;

import com.tactfactory.designpattern.controle.entity.food.Accompaniment;

public class AccompanimentPotatoes extends Accompaniment {

    public AccompanimentPotatoes() {}

    public AccompanimentPotatoes(String size) {
        this.setName("Potatoes");

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
                System.err.println("AccompanimentPotatoesException : new size");
                break;
        }
    }

}
