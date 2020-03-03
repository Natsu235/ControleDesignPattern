package com.tactfactory.designpattern.controle.builder;

import com.tactfactory.designpattern.controle.entity.Item;
import com.tactfactory.designpattern.controle.entity.Meal;

public class MealBuilder {
    private Meal meal = Meal.getMeal();
    
    public Meal addItem(Item item) {
        this.meal.addItem(item);
        return meal;
    }
}
