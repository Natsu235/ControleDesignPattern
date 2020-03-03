package com.tactfactory.designpattern.controle.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.tactfactory.designpattern.controle.entity.Meal;

public class DetailsSelection extends JFrame {

    private Home home;
    private Meal meal;

    private JButton back = new JButton("Retour");
    private JTextField commandDetails = new JTextField();
    private JTextField price = new JTextField();

    public DetailsSelection() {
        this.setTitle("Details");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        bindActions();
        addButtons();
    
        this.setVisible(true);
    }

    private void addButtons() {
        JPanel container = new JPanel();
        container.setLayout(new GridLayout(3, 1));
        container.add(commandDetails);
        container.add(price);
        container.add(back);
        this.setContentPane(container);
    }

    private void bindActions() {

        // On "Retour" Button Clicked...
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                home.setVisible(true);
                DetailsSelection.this.dispose();
            }
        });
    }

    public void setHome(Home home) {
        this.home = home;
        //meal = home.getMeal();
        home.setVisible(false);
        Meal.getMeal().showItems();
        commandDetails.setText(Meal.getMeal().toString());
    }

}