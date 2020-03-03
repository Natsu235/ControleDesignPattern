package com.tactfactory.designpattern.controle.entity;

public interface Item {

    // Taille de l'élément
    public String size();

    // Nom de l'élément
    public String name();

    // Emballage de l'élément
    public Packing packing();

    // Prix de l'élément
    public float price();

}
