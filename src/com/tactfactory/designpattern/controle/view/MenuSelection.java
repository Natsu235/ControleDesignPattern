package com.tactfactory.designpattern.controle.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.tactfactory.designpattern.controle.builder.MealBuilder;
import com.tactfactory.designpattern.controle.entity.Meal;
import com.tactfactory.designpattern.controle.factory.MenuFactory;

public class MenuSelection extends JFrame {

    private Home home;

    private static String menu;
    private static String burger1;
    private static String burger2;
    private static String accompaniment;
    private static String drink;
    private static String game;

    //private ImageIcon bigMacIcon = new ImageIcon(this.getClass().getResource("/icons/bigMac.png"));

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

    private JButton fries = new JButton("Frites");
    private JButton potatoes = new JButton("Potatoes");

    private JButton gameBoard = new JButton("Jeu de société");
    private JButton gameRacing = new JButton("Jeu de course");

    private JButton confirm = new JButton("Valider");
    private JButton reset = new JButton("Réinitialiser");
    private JButton back = new JButton("Retour");

    public MenuSelection() {
        this.setTitle("Menu");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        confirm.setBackground(Color.decode("#c6ffd2"));
        reset.setBackground(Color.decode("#ff9d9d"));

        //bigMac.setToolTipText("Big Mac");
        //bigMac.setIcon(bigMacIcon);

        bindActions();
        addButtons();

        this.setVisible(true);
    }

    private void addButtons() {
        JPanel container = new JPanel();
        container.setLayout(new GridLayout(3, 1));

        JPanel containerType = new JPanel();
        containerType.setLayout(new GridLayout(2, 4));
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

        container.add(confirm);
        container.add(reset);
        container.add(back);

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
                game = Math.random() < 0.5 ? "Jeu de société" : "Jeu de course";
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
                resetBurgers2Color();
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
                bigTasty.setBackground(Color.decode("#c4ecfd"));
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

        // On "Frites" Button Clicked...
        fries.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetAccompanimentsColor();
                fries.setBackground(Color.decode("#c4ecfd"));
                accompaniment = "Frites";
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

        // On "Valider" Button Clicked...
        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuFactory mf = new MenuFactory();
                MealBuilder builder = new MealBuilder();

                builder.addItem(mf.create(menu, burger1, burger2, accompaniment, drink, game));

                home.setVisible(true);
                MenuSelection.this.dispose();
            }
        });

        // On "Réinitialiser" Button Clicked...
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enableButtons(true);
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

        // On "Retour" Button Clicked...
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                home.setVisible(true);
                MenuSelection.this.dispose();
            }
        });
    }

    // Reset Variables
    public void resetMenu() {
        menu = null;
        burger1 = null;
        burger2 = null;
        accompaniment = null;
        drink = null;
        game = null;
    }

    // Output Variables
    public void showDebug() {
    	System.out.println(menu);
    	System.out.println(burger1);
    	System.out.println(burger2);
    	System.out.println(accompaniment);
    	System.out.println(drink);
    	System.out.println(game);
    	System.out.println();
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
    	showDebug();
        if (menu != null) {
            switch (menu) {
                case "Happy Meal":
                    if (burger1 != null && drink != null && accompaniment != null && game != null)
                        confirm.setEnabled(true);
                    else
                        confirm.setEnabled(false);
                    break;
                case "Best Of":
                case "Maxi Best Of":
                    if (burger1 != null && drink != null && accompaniment != null)
                        confirm.setEnabled(true);
                    else
                        confirm.setEnabled(false);
                    break;
                case "Mc Royale":
                    if (burger1 != null && burger2 != null && drink != null && accompaniment != null)
                        confirm.setEnabled(true);
                    else
                        confirm.setEnabled(false);
                    break;
                default:
                    confirm.setEnabled(false);
                    break;
            }
        }
        else
            confirm.setEnabled(false);
    }

    // Display Application Main Frame
    public void setHome(Home home) {
        this.home = home;
        home.setVisible(false);
    }

}
