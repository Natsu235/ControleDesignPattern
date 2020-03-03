package com.tactfactory.designpattern.controle.entity.packing;

import com.tactfactory.designpattern.controle.entity.Packing;

public class Box implements Packing {

    public Box() {}

    @Override
    public String pack() {
        return "Box";
    }

}
