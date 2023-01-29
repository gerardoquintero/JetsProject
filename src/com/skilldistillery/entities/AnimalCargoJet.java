package com.skilldistillery.entities;

public class AnimalCargoJet extends Jet implements CargoCarrier{

	public AnimalCargoJet(String model, double range, double price, double speed) {
		super(model, range, price, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadCargo() {
		System.out.println("Loading Cargo... Animals...");
	}

	@Override
	public String toString() {
		return "Animal Cargo Jet: Model=" + getModel() + ", Range=" + getRange() + ", Price=" + getPrice()
				+ ", Speed=" + getSpeed();
	}
}
