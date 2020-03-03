package com.tactfactory.designpattern.controle.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.tactfactory.designpattern.controle.entities.Meal;

public class MenuSelection extends JFrame {

  private Home home;
  private Meal meal;

  private JButton happyMeal = new JButton("HappyMeal");
  private JButton bestOf = new JButton("BestOf");
  private JButton maxiBestOf = new JButton("MaxiBestOf");
  private JButton maxiBestOf = new JButton("McRoyale");

  private JButton burger1 = new JButton("Burger1");
  private JButton burger2 = new JButton("Burger2");

  private JButton drink1 = new JButton("Drink1");
  private JButton drink2 = new JButton("Drink2");

  private JButton fries = new JButton("Fries");
  private JButton potatoes = new JButton("Potatoes");

  private JButton validate = new JButton("Valider");
  private JButton cancel = new JButton("Annuler");

  public MenuSelection() {
    this.setTitle("Menu");
    this.setSize(400, 200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    bindActions();
    addButtons();

    this.setVisible(true);
  }

  private void addButtons() {
    JPanel container = new JPanel();
    container.setLayout(new GridLayout(3, 1));

    JPanel containerType = new JPanel();
    containerType.setLayout(new GridLayout(1, 2));
    containerType.add(bestOf);
    containerType.add(maxiBestOf);
    container.add(containerType);

    JPanel containerBurger = new JPanel();
    containerBurger.setLayout(new GridLayout(2, 4));
    containerBurger.add(burger1);
    containerBurger.add(burger2);
    container.add(containerBurger);

    JPanel containerDrink = new JPanel();
    containerDrink.setLayout(new GridLayout(2, 4));
    containerDrink.add(drink1);
    containerDrink.add(drink2);
    container.add(containerDrink);

    JPanel containerAccompaniment = new JPanel();
    containerAccompaniment.setLayout(new GridLayout(2, 4));
    containerAccompaniment.add(fries);
    containerAccompaniment.add(potatoes);
    container.add(containerAccompaniment);

    container.add(validate);
    container.add(cancel);
    this.setContentPane(container);
  }

  private void bindActions() {

    // On "Valider" Button Clicked...
    validate.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        // Valider la commande
        home.setMeal(meal);
        home.setVisible(true);
        MenuSelection.this.dispose();
      }
    });

    // On "Annuler" Button Clicked...
    validate.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        // Annuler la commande
        home.setVisible(true);
        MenuSelection.this.dispose();
      }
    });

  }

  public void setHome(Home home) {
    this.home = home;
    meal = home.getMeal();
    home.setVisible(false);
  }

}
