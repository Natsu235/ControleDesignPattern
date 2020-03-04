package com.tactfactory.designpattern.controle.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.tactfactory.designpattern.controle.entity.Meal;

public class DetailsSelection extends JFrame {

    private Home home;

    private JTextArea commandDetails = new JTextArea();
    private JTextArea price = new JTextArea();
    private JButton back = new JButton("Retour");

    public DetailsSelection() {
        this.setTitle("Details");
        this.setSize(620, 380);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        bindActions();
        addButtons();
    
        this.setVisible(true);
    }

    private void addButtons() {
        JPanel container = new JPanel();
        container.setLayout(new GridLayout(2, 1));
        container.add(commandDetails);
        //container.add(price);
        container.add(back);
        this.setContentPane(container);
    }

    private void bindActions() {

        // On "Retour" Button Clicked...
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Meal.newMeal();
                home.setVisible(true);
                DetailsSelection.this.dispose();
            }
        });
    }

    public void setHome(Home home) {
        this.home = home;
        home.setVisible(false);
        Meal.getMeal().showItems();
        commandDetails.setText(Meal.getMeal().toString());
    }

}
