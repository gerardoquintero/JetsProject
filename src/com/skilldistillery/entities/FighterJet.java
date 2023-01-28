package com.skilldistillery.entities;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String model, double range, double price, double speed) {
		super(model, range, price, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fight() {
		System.out.println("Ready for combat");
		
	}
	@Override
	public String toString() {
		return "FigterJet: Model=" + getModel() + ", Range=" + getRange() + ", Price=" + getPrice()
				+ ", Speed=" + getSpeed();
	}

}
