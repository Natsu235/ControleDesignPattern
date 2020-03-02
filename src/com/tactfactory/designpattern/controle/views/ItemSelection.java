package com.tactfactory.designpattern.controle.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.tactfactory.designpattern.controle.entities.Meal;
import com.tactfactory.designpattern.controle.entities.MealBuilder;
import com.tactfactory.designpattern.controle.entities.food.AccompanimentFries;
import com.tactfactory.designpattern.controle.entities.food.AccompanimentPotatoes;
import com.tactfactory.designpattern.controle.entities.food.BurgerBigMac;
import com.tactfactory.designpattern.controle.entities.food.BurgerTripleCheese;
import com.tactfactory.designpattern.controle.entities.food.DrinkCoca;
import com.tactfactory.designpattern.controle.entities.food.DrinkPepsi;

public class ItemSelection extends JFrame {

  private Home home;

  private JButton burger1 = new JButton("Big Mac");
  private JButton burger2 = new JButton("Triple Cheese");

  private JButton drink1Small = new JButton("Petit coca");
  private JButton drink1Medium = new JButton("Moyen Coca");
  private JButton drink1Big = new JButton("Grand Coca");

  private JButton drink2Small = new JButton("Petit pepsi");
  private JButton drink2Medium = new JButton("Moyen pepsi");
  private JButton drink2Big = new JButton("Grand pepsi");

  private JButton friesSmall = new JButton("Petite frite");
  private JButton friesMedium = new JButton("Moyenne frite");
  private JButton friesBig = new JButton("Grande frite");

  private JButton potatoesSmall = new JButton("Petites potatoes");
  private JButton potatoesMedium = new JButton("Moyennes potatoes");
  private JButton potatoesBig = new JButton("Grandes potatoes");

  private JButton validate = new JButton("Valider");
  
  final MealBuilder mealBuilder = new MealBuilder();

  public ItemSelection() {
    this.setTitle("Items");
    this.setSize(400, 200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    bindActions();
    addButtons();

    this.setVisible(true);
  }

  private void addButtons() {
    JPanel container = new JPanel();
    container.setLayout(new GridLayout(3, 1));

    JPanel containerBurger = new JPanel();
    containerBurger.setLayout(new GridLayout(2, 4));
    containerBurger.add(burger1);
    containerBurger.add(burger2);
    container.add(containerBurger);

    JPanel containerDrink = new JPanel();
    containerDrink.setLayout(new GridLayout(2, 3));
    containerDrink.add(drink1Small);
    containerDrink.add(drink1Medium);
    containerDrink.add(drink1Big);
    containerDrink.add(drink2Small);
    containerDrink.add(drink2Medium);
    containerDrink.add(drink2Big);
    container.add(containerDrink);

    JPanel containerAccompaniment = new JPanel();
    containerAccompaniment.setLayout(new GridLayout(2, 3));
    containerAccompaniment.add(friesSmall);
    containerAccompaniment.add(friesMedium);
    containerAccompaniment.add(friesBig);
    containerAccompaniment.add(potatoesSmall);
    containerAccompaniment.add(potatoesMedium);
    containerAccompaniment.add(potatoesBig);
    container.add(containerAccompaniment);

    container.add(validate);
    this.setContentPane(container);
  }

  private void bindActions() {

	  // Actions code here
	  
	  //Burger
	  burger1.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new BurgerBigMac());
	      }
	    });
	  
	  burger2.addActionListener(new ActionListener() {
		  @Override
		  public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new BurgerTripleCheese());
	    	  System.out.println("Miam");
	      }
	    });
	  
	  //Drink 1
	  drink1Small.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new DrinkCoca("petit"));
	      }
	    });
	  
	  drink1Medium.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new DrinkCoca("moyen"));
	      }
	    });
		
	  drink1Big.addActionListener(new ActionListener() {
		  @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new DrinkCoca("grand"));
	      }
	    });
	  
	  //Drink 2
	  drink2Small.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new DrinkPepsi("petit"));
	      }
	    });
	  
	  drink2Medium.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new DrinkPepsi("moyen"));
	      }
	    });
		
	  drink2Big.addActionListener(new ActionListener() {
		  @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new DrinkPepsi("grand"));
	      }
	    });
	  
	  //Fries
	  friesSmall.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new AccompanimentFries("petit"));
	      }
	    });
	  
	  friesMedium.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new AccompanimentFries("moyen"));
	      }
	    });
		
	  friesBig.addActionListener(new ActionListener() {
		  @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new AccompanimentFries("grand"));
	      }
	    });
	  
	  //Potatoes
	  potatoesSmall.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new AccompanimentPotatoes("petit"));
	      }
	    });
	  
	  potatoesMedium.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new AccompanimentPotatoes("moyen"));
	      }
	    });
		
	  potatoesBig.addActionListener(new ActionListener() {
		  @Override
	      public void actionPerformed(ActionEvent e) {
	    	  mealBuilder.addItem(new AccompanimentPotatoes("grand"));
	      }
	    });

    validate.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        home.setVisible(true);
        ItemSelection.this.dispose();
      }
    });
  }

  public void setHome(Home home) {
    this.home = home;
    home.setVisible(false);
  }
}
