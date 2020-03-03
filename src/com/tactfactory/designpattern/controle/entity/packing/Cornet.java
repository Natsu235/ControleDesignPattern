package com.tactfactory.designpattern.controle.entity.packing;

import com.tactfactory.designpattern.controle.entity.Packing;

public class Cornet implements Packing {

    public Cornet() {}

    @Override
    public String pack() {
        return "Cornet";
    }

}
