package com.tactfactory.designpattern.controle.entities.packing;

import com.tactfactory.designpattern.controle.entities.Packing;

public class PaperCup implements Packing {
	@Override
	public String pack() {
		return "Paper Cup";
	}
}
