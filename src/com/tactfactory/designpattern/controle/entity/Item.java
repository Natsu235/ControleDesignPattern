package com.tactfactory.designpattern.controle.entity;

public interface Item {

    // Taille de l'�l�ment
    public String size();

    // Nom de l'�l�ment
    public String name();

    // Emballage de l'�l�ment
    public Packing packing();

    // Prix de l'�l�ment
    public float price();

}
