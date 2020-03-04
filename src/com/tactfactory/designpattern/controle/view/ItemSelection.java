package com.tactfactory.designpattern.controle.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.tactfactory.designpattern.controle.builder.MealBuilder;
import com.tactfactory.designpattern.controle.entity.Meal;
import com.tactfactory.designpattern.controle.entity.food.AccompanimentFries;
import com.tactfactory.designpattern.controle.entity.food.AccompanimentPotatoes;
import com.tactfactory.designpattern.controle.entity.food.BurgerBigMac;
import com.tactfactory.designpattern.controle.entity.food.BurgerTripleCheese;
import com.tactfactory.designpattern.controle.entity.food.BurgerCBO;
import com.tactfactory.designpattern.controle.entity.food.BurgerBigTasty;
import com.tactfactory.designpattern.controle.entity.food.DrinkCoca;
import com.tactfactory.designpattern.controle.entity.food.DrinkFanta;

public class ItemSelection extends JFrame {

  private Home home;
  private final MealBuilder builder = new MealBuilder();

  private JButton burger1 = new JButton("Big Mac");
  private JButton burger2 = new JButton("Triple Cheese");

  private JButton burger3 = new JButton("CBO");
  private JButton burger4 = new JButton("Big Tasty");

  private JButton drink1Small = new JButton("Petit Coca");
  private JButton drink1Medium = new JButton("Moyen Coca");
  private JButton drink1Big = new JButton("Grand Coca");

  private JButton drink2Small = new JButton("Petit Fanta");
  private JButton drink2Medium = new JButton("Moyen Fanta");
  private JButton drink2Big = new JButton("Grand Fanta");

  private JButton friesSmall = new JButton("Petites Frites");
  private JButton friesMedium = new JButton("Moyennes Frites");
  private JButton friesBig = new JButton("Grandes Frites");

  private JButton potatoesSmall = new JButton("Petites Potatoes");
  private JButton potatoesMedium = new JButton("Moyennes Potatoes");
  private JButton potatoesBig = new JButton("Grandes Potatoes");

  private JButton confirm = new JButton("Valider");
  private JButton back = new JButton("Retour");

  public ItemSelection() {
    this.setTitle("Items");
    this.setSize(600, 400);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    confirm.setBackground(Color.decode("#c6ffd2"));

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
    containerBurger.add(burger3);
    containerBurger.add(burger4);
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

    container.add(confirm);
    container.add(back);

    this.setContentPane(container);
  }

  private void bindActions() {

    // Actions code here

    // Burgers
    burger1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          builder.addItem(new BurgerBigMac());
        }
      });

    burger2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          builder.addItem(new BurgerTripleCheese());
          System.out.println("Miam!");
        }
      });

    burger3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          builder.addItem(new BurgerCBO());
        }
      });

    burger4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          builder.addItem(new BurgerBigTasty());
        }
      });

    // Drinks
    drink1Small.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          builder.addItem(new DrinkCoca("Petit"));
        }
      });

    drink1Medium.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          builder.addItem(new DrinkCoca("Moyen"));
        }
      });

    drink1Big.addActionListener(new ActionListener() {
      @Override
        public void actionPerformed(ActionEvent e) {
          builder.addItem(new DrinkCoca("Grand"));
        }
      });

    drink2Small.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          builder.addItem(new DrinkFanta("Petit"));
        }
      });

    drink2Medium.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          builder.addItem(new DrinkFanta("Moyen"));
        }
      });

    drink2Big.addActionListener(new ActionListener() {
      @Override
        public void actionPerformed(ActionEvent e) {
          builder.addItem(new DrinkFanta("Grand"));
        }
      });

    // Accompaniements
    friesSmall.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          builder.addItem(new AccompanimentFries("Petit"));
        }
      });

    friesMedium.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          builder.addItem(new AccompanimentFries("Moyen"));
        }
      });

    friesBig.addActionListener(new ActionListener() {
      @Override
        public void actionPerformed(ActionEvent e) {
          builder.addItem(new AccompanimentFries("Grand"));
        }
      });

    potatoesSmall.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          builder.addItem(new AccompanimentPotatoes("Petit"));
        }
      });

    potatoesMedium.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          builder.addItem(new AccompanimentPotatoes("Moyen"));
        }
      });

    potatoesBig.addActionListener(new ActionListener() {
      @Override
        public void actionPerformed(ActionEvent e) {
          builder.addItem(new AccompanimentPotatoes("Grand"));
        }
      });

    confirm.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        home.setVisible(true);
        ItemSelection.this.dispose();
      }
    });

    back.addActionListener(new ActionListener() {
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
