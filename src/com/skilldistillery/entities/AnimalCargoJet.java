package com.skilldistillery.entities;

public class AnimalCargoJet extends Jet implements CargoCarrier{

	public AnimalCargoJet(String model, double range, double price, double speed) {
		super(model, range, price, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadCargo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "AnimalCargoJet: Model=" + getModel() + ", Range=" + getRange() + ", Price=" + getPrice()
				+ ", Speed=" + getSpeed();
	}
}
