package com.skilldistillery.entities;

public class CargoPlane extends Jet implements CargoCarrier  {

	public CargoPlane(String model, double range, double price, double speed) {
		super(model, range, price, speed);
	}

	@Override
	public void loadCargo() {
		System.out.println("Loading cargo!");
	}
	@Override
	public String toString() {
		return "Cargo Plane: Model=" + getModel() + ", Range=" + getRange() + ", Price=" + getPrice()
				+ ", Speed=" + getSpeed();
	}
}
