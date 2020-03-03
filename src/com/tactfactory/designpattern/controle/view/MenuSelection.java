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
import com.tactfactory.designpattern.controle.factory.MenuFactory;

public class MenuSelection extends JFrame {

    private Home home;
    private Meal meal;

    private static String menu;
    private static String burger1;
    private static String burger2;
    private static String accompaniment;
    private static String drink;
    private static String game;

    private JButton happyMeal = new JButton("Happy Meal");
    private JButton bestOf = new JButton("Best Of");
    private JButton maxiBestOf = new JButton("Maxi Best Of");
    private JButton mcRoyale = new JButton("Mc Royale");

    private JButton bigMac = new JButton("Big Mac");
    private JButton tripleCheese = new JButton("Triple Cheese");
    private JButton CBO = new JButton("CBO");
    private JButton bigTasty = new JButton("Big Tasty");

    private JButton coca = new JButton("Coca Cola");
    private JButton fanta = new JButton("Fanta");

    private JButton fries = new JButton("Fries");
    private JButton potatoes = new JButton("Potatoes");

    private JButton gameBoard = new JButton("Fries");
    private JButton gameRacing = new JButton("Potatoes");

    private JButton submit = new JButton("Valider");
    private JButton cancel = new JButton("Annuler");
    private JButton reset = new JButton("Réinitialiser");

    public MenuSelection() {
        this.setTitle("Menu");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submit.setBackground(Color.decode("#c6ffd2"));
        cancel.setBackground(Color.decode("#fee0c2"));
        reset.setBackground(Color.decode("#ff9d9d"));

        bindActions();
        addButtons();

        this.setVisible(true);
    }

    private void addButtons() {
        JPanel container = new JPanel();
        container.setLayout(new GridLayout(3, 1));

        JPanel containerType = new JPanel();
        containerType.setLayout(new GridLayout(1, 2));
        containerType.add(happyMeal);
        containerType.add(bestOf);
        containerType.add(maxiBestOf);
        containerType.add(mcRoyale);
        container.add(containerType);

        JPanel containerBurger = new JPanel();
        containerBurger.setLayout(new GridLayout(2, 4));
        containerBurger.add(bigMac);
        containerBurger.add(tripleCheese);
        containerBurger.add(CBO);
        containerBurger.add(bigTasty);
        container.add(containerBurger);

        JPanel containerDrink = new JPanel();
        containerDrink.setLayout(new GridLayout(2, 4));
        containerDrink.add(coca);
        containerDrink.add(fanta);
        container.add(containerDrink);

        JPanel containerAccompaniment = new JPanel();
        containerAccompaniment.setLayout(new GridLayout(2, 4));
        containerAccompaniment.add(fries);
        containerAccompaniment.add(potatoes);
        container.add(containerAccompaniment);

        container.add(submit);
        container.add(cancel);
        container.add(reset);

        this.setContentPane(container);
    }

    private void bindActions() {

        // On "Happy Meal" Button Clicked...
        happyMeal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetMenusColor();
                resetBurgers2Color();
                happyMeal.setBackground(Color.decode("#c4ecfd"));
                menu = "Happy Meal";
                burger2 = null;
                enableButtons(false);
                enableButtons(true);
                checkValidity();
            }
        });

        // On "Best Of" Button Clicked...
        bestOf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetMenusColor();
                resetBurgers2Color();
                resetGamesColor();
                bestOf.setBackground(Color.decode("#c4ecfd"));
                menu = "Best Of";
                burger2 = null;
                game = null;
                enableButtons(false);
                enableButtons(true);
                checkValidity();
            }
        });

        // On "Maxi Best Of" Button Clicked...
        maxiBestOf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetMenusColor();
                resetBurgers2Color();
                resetGamesColor();
                maxiBestOf.setBackground(Color.decode("#c4ecfd"));
                menu = "Maxi Best Of";
                burger2 = null;
                game = null;
                enableButtons(false);
                enableButtons(true);
                checkValidity();
            }
        });

        // On "Mc Royale" Button Clicked...
        mcRoyale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetMenusColor();
                resetGamesColor();
                mcRoyale.setBackground(Color.decode("#c4ecfd"));
                menu = "Mc Royale";
                game = null;
                enableButtons(false);
                enableButtons(true);
                checkValidity();
            }
        });

        // On "Big Mac" Button Clicked...
        bigMac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetBurgers1Color();
                bigMac.setBackground(Color.decode("#c4ecfd"));
                burger1 = "Big Mac";
                checkValidity();
            }
        });

        // On "Triple Cheese" Button Clicked...
        tripleCheese.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetBurgers1Color();
                tripleCheese.setBackground(Color.decode("#c4ecfd"));
                burger1 = "Triple Cheese";
                checkValidity();
            }
        });

        // On "Triple Cheese" Button Clicked...
        CBO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetBurgers1Color();
                CBO.setBackground(Color.decode("#c4ecfd"));
                burger2 = "CBO";
                checkValidity();
            }
        });

        // On "Big Tasty" Button Clicked...
        bigTasty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetBurgers2Color();
                bigTasty.setBackground(Color.decode("#B0E0E6"));
                burger2 = "Big Tasty";
                checkValidity();
            }
        });

        // On "Coca Cola" Button Clicked...
        coca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetDrinksColor();
                coca.setBackground(Color.decode("#c4ecfd"));
                drink = "Coca Cola";
                checkValidity();
            }
        });

        // On "Fanta" Button Clicked...
        fanta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetDrinksColor();
                fanta.setBackground(Color.decode("#c4ecfd"));
                drink = "Fanta";
                checkValidity();
            }
        });

        // On "Fries" Button Clicked...
        fries.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetAccompanimentsColor();
                fries.setBackground(Color.decode("#c4ecfd"));
                accompaniment = "Fries";
                checkValidity();
            }
        });

        // On "Potatoes" Button Clicked...
        potatoes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetAccompanimentsColor();
                potatoes.setBackground(Color.decode("#c4ecfd"));
                accompaniment = "Potatoes";
                checkValidity();
            }
        });

        // On "Game Board" Button Clicked...
        gameBoard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetGamesColor();
                gameBoard.setBackground(Color.decode("#c4ecfd"));
                game = "Jeu de société";
                checkValidity();
            }
        });

        // On "Game Racing" Button Clicked...
        gameRacing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetGamesColor();
                gameBoard.setBackground(Color.decode("#c4ecfd"));
                game = "Jeu de course";
                checkValidity();
            }
        });

        // On "Réinitialiser" Button Clicked...
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enableButtons(false);
                resetBurgers1Color();
                resetBurgers2Color();
                resetAccompanimentsColor();
                resetDrinksColor();
                resetGamesColor();
                resetMenusColor();
                resetMenu();
                checkValidity();
            }
        });

        // On "Annuler" Button Clicked...
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                home.setVisible(true);
                MenuSelection.this.dispose();
            }
        });

        // On "Valider" Button Clicked...
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuFactory mf = new MenuFactory();
                MealBuilder builder = new MealBuilder();

                builder.addItem(mf.create(menu, burger1, burger2, accompaniment, drink, game));

                home.setVisible(true);
                MenuSelection.this.dispose();
            }
        });
    }

    public void resetMenu() {
        menu = null;
        burger1 = null;
        burger2 = null;
        accompaniment = null;
        drink = null;
        game = null;
    }

    public void resetMenusColor() {
        happyMeal.setBackground(new JButton().getBackground());
        bestOf.setBackground(new JButton().getBackground());
        maxiBestOf.setBackground(new JButton().getBackground());
        mcRoyale.setBackground(new JButton().getBackground());
    }

    public void resetBurgers1Color() {
        bigMac.setBackground(new JButton().getBackground());
        tripleCheese.setBackground(new JButton().getBackground());
    }

    public void resetBurgers2Color() {
        CBO.setBackground(new JButton().getBackground());
        bigTasty.setBackground(new JButton().getBackground());
    }

    public void resetDrinksColor() {
        coca.setBackground(new JButton().getBackground());
        fanta.setBackground(new JButton().getBackground());
    }

    public void resetAccompanimentsColor() {
        fries.setBackground(new JButton().getBackground());
        potatoes.setBackground(new JButton().getBackground());
    }

    public void resetGamesColor() {
        gameBoard.setBackground(new JButton().getBackground());
        gameRacing.setBackground(new JButton().getBackground());
    }

    // Change Buttons State
    public void enableButtons(boolean state) {
        bigMac.setEnabled(state);
        tripleCheese.setEnabled(state);
        coca.setEnabled(state);
        fanta.setEnabled(state);
        fries.setEnabled(state);
        potatoes.setEnabled(state);
        if (state) {
            if (menu == "Happy Meal") {
                gameBoard.setEnabled(state);
                gameRacing.setEnabled(state);
            }
            if (menu == "Mc Royale") {
                CBO.setEnabled(state);
                bigTasty.setEnabled(state);
            }
        }
    }

    // Check "Valider" Button State
    public void checkValidity() {
        if (menu != null) {
            switch (menu) {
                case "Happy Meal":
                    if (burger1 != null && drink != null && accompaniment != null && game != null)
                        submit.setEnabled(true);
                    else
                        submit.setEnabled(false);
                    break;
                case "Best Of":
                case "Maxi Best Of":
                    if (burger1 != null && drink != null && accompaniment != null)
                        submit.setEnabled(true);
                    else
                        submit.setEnabled(false);
                    break;
                case "Mc Royale":
                    if (burger1 != null && burger2 != null && drink != null && accompaniment != null)
                        submit.setEnabled(true);
                    else
                        submit.setEnabled(false);
                    break;
                default:
                    submit.setEnabled(false);
                    break;
            }
        }
        else
            submit.setEnabled(false);
    }

    // Display Application Main Frame
    public void setHome(Home home) {
        this.home = home;
        home.setVisible(false);
    }

}
