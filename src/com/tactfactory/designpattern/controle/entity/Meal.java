package com.tactfactory.designpattern.controle.entity;

import java.util.ArrayList;
import java.util.List;

import com.tactfactory.designpattern.controle.entity.food.Accompaniment;
import com.tactfactory.designpattern.controle.entity.food.AccompanimentFries;
import com.tactfactory.designpattern.controle.entity.food.AccompanimentPotatoes;
import com.tactfactory.designpattern.controle.entity.food.Drink;
import com.tactfactory.designpattern.controle.entity.food.DrinkCoca;
import com.tactfactory.designpattern.controle.entity.food.DrinkFanta;

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
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }

        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }

    @Override
    public String toString() {
        String text = "";

        for (Item item : items) {
            text += item.name() + " au prix (unitaire) de " + item.price() + " ";
            if (item instanceof Drink) {
                if (item instanceof DrinkCoca) {
                    if (item.price() == 1.80F)
                        text += "Size: petit";
                    else if (item.price() == 2.50F)
                        text += "Size: moyenne";
                    else
                        text += "Size: grande";
                }
                if(item instanceof DrinkFanta) {
                    if(item.price() == 1.80F)
                        text += "Size: petit";
                    else if(item.price() == 2.50F)
                        text += "Size: moyenne";
                    else
                        text += "Size: grande";
                }
            }
            if (item instanceof Accompaniment) {
                if (item instanceof AccompanimentFries) {
                    if (item.price() == 1.80F)
                        text += "Size: petit";
                    else if (item.price() == 2.50F)
                        text += "Size: moyenne";
                    else
                        text += "Size: grande";
                }
                if(item instanceof AccompanimentPotatoes) {
                    if(item.price() == 1.80F)
                        text += "Size: petit";
                    else if(item.price() == 2.50F)
                        text += "Size: moyenne";
                    else
                        text += "Size: grande";
                }
            }
        }

        return text;
    }

}
