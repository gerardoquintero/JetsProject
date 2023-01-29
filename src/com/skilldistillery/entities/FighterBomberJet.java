package com.skilldistillery.entities;

public class FighterBomberJet extends Jet implements CombatReady {

	public FighterBomberJet(String model, double range, double price, double speed) {
		super(model, range, price, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fight() {
		System.out.println("BOMBS AWAY!!!!");
	}
	@Override
	public String toString() {
		return "Fighter Bomber Jet: Model=" + getModel() + ", Range=" + getRange() + ", Price=" + getPrice()
				+ ", Speed=" + getSpeed();
	}

}
