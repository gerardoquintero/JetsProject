package com.skilldistillery.entities;

public class FighterBomberJet extends Jet implements CombatReady {

	public FighterBomberJet(String model, double range, double price, double speed) {
		super(model, range, price, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "FighterBomberJet: Model=" + getModel() + ", Range=" + getRange() + ", Price=" + getPrice()
				+ ", Speed=" + getSpeed();
	}

}