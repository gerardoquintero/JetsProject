package com.skilldistillery.entities;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String model, double range, double price, double speed) {
		super(model, range, price, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fight() {
		System.out.println("Buckle up buckaroo.. oh no they got Kenny!");
		
	}
	@Override
	public String toString() {
		return "Fighter Jet: Model=" + getModel() + ", Range=" + getRange() + ", Price=" + getPrice()
				+ ", Speed=" + getSpeed();
	}

}
