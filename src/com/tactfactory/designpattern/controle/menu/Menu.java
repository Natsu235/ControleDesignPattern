package com.tactfactory.designpattern.controle.menu;

import com.tactfactory.designpattern.controle.entity.Item;
import com.tactfactory.designpattern.controle.entity.Packing;
import com.tactfactory.designpattern.controle.entity.food.Accompaniment;
import com.tactfactory.designpattern.controle.entity.food.AccompanimentFries;
import com.tactfactory.designpattern.controle.entity.food.AccompanimentPotatoes;
import com.tactfactory.designpattern.controle.entity.food.Burger;
import com.tactfactory.designpattern.controle.entity.food.BurgerBigMac;
import com.tactfactory.designpattern.controle.entity.food.BurgerBigTasty;
import com.tactfactory.designpattern.controle.entity.food.BurgerCBO;
import com.tactfactory.designpattern.controle.entity.food.BurgerTripleCheese;
import com.tactfactory.designpattern.controle.entity.food.Drink;
import com.tactfactory.designpattern.controle.entity.food.DrinkCoca;
import com.tactfactory.designpattern.controle.entity.food.DrinkFanta;
import com.tactfactory.designpattern.controle.entity.item.Game;
import com.tactfactory.designpattern.controle.entity.item.GameBoard;
import com.tactfactory.designpattern.controle.entity.item.GameRacing;
import com.tactfactory.designpattern.controle.entity.packing.Box;

public class Menu implements Item {

    private String size;
    private String name;
    private Packing packing = new Box();
    private float price;

    private Burger burger1;
    private Burger burger2;
    private Accompaniment accompaniment;
    private Drink drink;
    private Game game;

    public Menu() {}

    @Override
    public String size() { return this.size; }

    @Override
    public String name() { return this.name; }

    @Override
    public Packing packing() { return this.packing; }

    @Override
    public float price() { return this.price; }

    // Getters
    public String getSize() { return size; }
    public String getName() { return name; }
    public Packing getPacking() { return packing; }
    public float getPrice() { return price; }

    // Setters
    public void setSize(String size) { this.size = size; }
    public void setName(String name) { this.name = name; }
    public void setPacking(Packing packing) { this.packing = packing; }
    public void setPrice(float price) { this.price = price; }

    public void setBurger1(String burger1) {
        if (burger1 != null) {
            switch (burger1) {
                case "Big Mac":
                    this.burger1 = new BurgerBigMac();
                    break;
                case "Triple Cheese":
                    this.burger1 = new BurgerTripleCheese();
                    break;
                default:
                    this.burger1 = null;
                    break;
            }
        }
    }

    public void setBurger2(String burger2) {
        if (burger2 != null) {
            switch (burger2) {
                case "CBO":
                    this.burger2 = new BurgerCBO();
                    break;
                case "Big Tasty":
                    this.burger2 = new BurgerBigTasty();
                    break;
                default:
                    this.burger2 = null;
                    break;
            }
        }
    }

    public void setAccompaniment(String accompaniment) {
        if (accompaniment != null) {
            switch (accompaniment) {
                case "Frites":
                    this.accompaniment = new AccompanimentFries(size);
                    break;
                case "Potatoes":
                    this.accompaniment = new AccompanimentPotatoes(size);
                    break;
                default:
                    this.accompaniment = null;
                    break;
            }
        }
    }

    public void setDrink(String drink) {
        if (drink != null) {
            switch (drink) {
                case "Coca Cola":
                    this.drink = new DrinkCoca(size);
                    break;
                case "Fanta":
                    this.drink = new DrinkFanta(size);
                    break;
                default:
                    this.drink = null;
                    break;
            }
        }
    }

    public void setGame(String game) {
        if (game != null) {
            switch (game) {
                case "Jeu de société":
                    this.game = new GameBoard();
                    break;
                case "Jeu de course":
                    this.game = new GameRacing();
                    break;
                default:
                    this.game = null;
                    break;
            }
        }
    }

    @Override
    public String toString() {
        return " - 1 Burger: " + burger1.getName() + (burger2 != null ? "\n - 1 Burger: " + burger2.getName() : "") + "\n - 1 Accompagnement: " + size + " " + accompaniment.getName() + "\n - 1 Boisson: " + size + " " + drink.getName() + (game != null ? "\n - 1 Jouet: " + game.getName() : "");
    }

}
