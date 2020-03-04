package com.tactfactory.designpattern.controle.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.tactfactory.designpattern.controle.entity.Meal;

public class Home extends JFrame {

    private Meal meal = new Meal();

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public Meal getMeal() {
        return meal;
    }

    private JButton menus = new JButton("Composer un menu");
    private JButton addItem = new JButton("Séléctionner des éléments");
    private JButton validate = new JButton("Valider la commande");

    public Home() {
        this.setTitle("Home");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        validate.setBackground(Color.decode("#c6ffd2"));

        bindActions();
        addButtons();

        this.setVisible(true);
    }

  private void addButtons() {
    JPanel container = new JPanel();
    container.setLayout(new GridLayout(3, 1));
    container.add(menus);
    container.add(addItem);
    container.add(validate);
    this.setContentPane(container);
  }

  private void bindActions() {
    menus.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        MenuSelection menuSelection = new MenuSelection();
        menuSelection.setHome(Home.this);
      }
    });

    addItem.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        ItemSelection itemSelection = new ItemSelection();
        itemSelection.setHome(Home.this);
      }
    });

    validate.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        DetailsSelection detailsSelection = new DetailsSelection();
        detailsSelection.setHome(Home.this);
      }
    });
  }
}
