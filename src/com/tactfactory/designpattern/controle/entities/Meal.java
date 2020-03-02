package com.tactfactory.designpattern.controle.entities;

import java.util.ArrayList;
import java.util.List;

import com.tactfactory.designpattern.controle.entities.food.Accompaniment;
import com.tactfactory.designpattern.controle.entities.food.AccompanimentFries;
import com.tactfactory.designpattern.controle.entities.food.AccompanimentPotatoes;
import com.tactfactory.designpattern.controle.entities.food.Drink;
import com.tactfactory.designpattern.controle.entities.food.DrinkCoca;
import com.tactfactory.designpattern.controle.entities.food.DrinkPepsi;

public class Meal {
  private static Meal meal;
  private List<Item> items = new ArrayList<Item>();
  
  public Meal() {
	  // Silence is golden..
  }
  
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
				if(item instanceof DrinkCoca) {
					if(item.price() == (float) 1.80) {
						text += "Size: petit";
					}else if(item.price() == (float) 2.50){
						text += "Size: moyenne";
					}else {
						text += "Size: grande";
					}
				}
				if(item instanceof DrinkPepsi) {
					if(item.price() == (float) 1.80) {
						text += "Size: petit";
					}else if(item.price() == (float) 2.50){
						text += "Size: moyenne";
					}else {
						text += "Size: grande";
					}
				}
			}
			
			if (item instanceof Accompaniment) {
				if(item instanceof AccompanimentFries) {
					if(item.price() == (float) 1.80) {
						text += "Size: petit";
					}else if(item.price() == (float) 2.50){
						text += "Size: moyenne";
					}else {
						text += "Size: grande";
					}
				}
				if(item instanceof AccompanimentPotatoes) {
					if(item.price() == (float) 1.80) {
						text += "Size: petit";
					}else if(item.price() == (float) 2.50){
						text += "Size: moyenne";
					}else {
						text += "Size: grande";
					}
				}
			}
		}
		return text;
	}
}

