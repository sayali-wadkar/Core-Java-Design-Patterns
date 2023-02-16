package com.prowings.creational.abstractfactory;

public class Sedan extends Car{

	public Sedan(Location location) {
		super(CarType.SEDAN,location);
		construct(location);
	}

	@Override
	public void construct(Location location) {

		System.out.println("Sedan Car Constructed in!!!"+this.getLocation());
	}

}
