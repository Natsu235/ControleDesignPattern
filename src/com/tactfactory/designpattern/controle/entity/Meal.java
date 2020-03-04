package com.tactfactory.designpattern.controle.entity;

import java.util.ArrayList;
import java.util.List;

import com.tactfactory.designpattern.controle.entity.food.Accompaniment;
import com.tactfactory.designpattern.controle.entity.food.AccompanimentFries;
import com.tactfactory.designpattern.controle.entity.food.AccompanimentPotatoes;
import com.tactfactory.designpattern.controle.entity.food.Drink;
import com.tactfactory.designpattern.controle.entity.food.DrinkCoca;
import com.tactfactory.designpattern.controle.entity.food.DrinkFanta;
import com.tactfactory.designpattern.controle.menu.Menu;

public class Meal {

    private static Meal meal;
    private List<Item> items = new ArrayList<Item>();

    public Meal() {}

    public static Meal getMeal() {
        if (meal == null) {
            meal = new Meal();
        }

        return meal;
    }

    public static void newMeal() {
        meal = new Meal();
    }

    public Meal addItem(Item item) {
        items.add(item);
        return this;
    }

    public Meal addItem(Item item, Integer number) {
        for (int i = 0; i < number; i++) {
            items.add(item);
        }

        return this;
    }

    public float getCost() {
        float cost = 0.0F;

        for (Item item : items) {
            cost += item.price();
        }

        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            if (item != null)
                System.out.println("Item: " + item.name() + ", Packing: " + item.packing().pack() + ", Price: " + item.price());
        }
    }

    public String showDetails() {
        String output = "" ;

        for (Item item : items) {
            if (item != null)
                  output += "Item: " + item.name() + ", Packing: " + item.packing().pack() +", Price: " + item.price() + "\n";
        }

        return output;
    }

    @Override
    public String toString() {
        String output = "";

        if (items.isEmpty()) {
            output = "La commande ne contient aucun élément.\n";
            return output;
        }

        for (Item item : items) {
            // Cas d'un menu...
            if (item instanceof Menu) {
                output += "1 Menu " + item.name() + "\n\n";
                output += "Composition du menu: \n";
                output += ((Menu) item) + "\n";
            }
            // Cas d'un élément seul...
            else {
                output += "- 1 ";
                if (item instanceof Drink) {
                    if (item instanceof DrinkCoca) {
                        if (item.price() == 1.80F)
                            output += "Petit ";
                        else if (item.price() == 2.50F)
                            output += "Moyen ";
                        else
                            output += "Grand ";
                    }
                    if (item instanceof DrinkFanta) {
                        if (item.price() == 1.80F)
                            output += "Petit ";
                        else if(item.price() == 2.50F)
                            output += "Moyen ";
                        else
                            output += "Grand ";
                    }
                }
                if (item instanceof Accompaniment) {
                    if (item instanceof AccompanimentFries) {
                        if (item.price() == 1.80F)
                            output += "Petites ";
                        else if (item.price() == 2.50F)
                            output += "Moyennes ";
                        else
                            output += "Grandes ";
                    }
                    if (item instanceof AccompanimentPotatoes) {
                        if (item.price() == 1.80F)
                            output += "Petites ";
                        else if (item.price() == 2.50F)
                            output += "Moyennes ";
                        else
                            output += "Grandes ";
                    }
                }

                output += item.name() + " au prix (unitaire) de " + item.price() + " €\n";
            }

        }

        output += "\n";
        output += "Total à payer: " + Math.round(getCost() * 10) / 10.0 + " €";
        return output;
    }

}
