package com.tactfactory.designpattern.controle.entities.packing;

import com.tactfactory.designpattern.controle.entities.Packing;

public class Box implements Packing {
	@Override
	public String pack() {
		return "Box";
	}
}
