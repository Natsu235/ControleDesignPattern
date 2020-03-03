package com.tactfactory.designpattern.controle.entity.packing;

import com.tactfactory.designpattern.controle.entity.Packing;

public class Cup implements Packing {

    public Cup() {}

    @Override
    public String pack() {
        return "Cup";
    }

}
