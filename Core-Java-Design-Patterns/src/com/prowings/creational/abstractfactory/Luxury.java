package com.prowings.creational.abstractfactory;

public class Luxury extends Car{

	public Luxury(Location location) {
		super(CarType.LUXURY, location);
		construct(location);
	}

	@Override
	public void construct(Location location) {
		System.out.println("Luxury car Constructed in !!!"+this.getLocation());		
	}

}
