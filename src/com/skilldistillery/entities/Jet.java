package com.skilldistillery.entities;

import java.util.Objects;

public abstract class Jet {

	private String model;
	private double range;
	private double price;
	private double speed;

	public Jet(String model, double range, double price, double speed) {
		super();
		this.model = model;
		this.range = range;
		this.price = price;
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void jet() {
		
	}
	
	public void fly() {
		System.out.println("At " + this.speed 
								 + "mph with a range of " + this.range 
								 + "miles, this jet can fly for " 
								 + (this.range/this.speed) + " hours.");
	}

	@Override
	public String toString() {
		return "Jet [model=" + model + ", range=" + range + ", price=" + price + ", speed=" + speed + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, price, range, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		return Objects.equals(model, other.model)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Double.doubleToLongBits(range) == Double.doubleToLongBits(other.range)
				&& Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed);
	}

}
