package com.prowings.creational.abstractfactory;

public class Sports extends Car{

	public Sports(Location location) {
		super(CarType.SPORTS,location);
		construct(location);
	}

	@Override
	public void construct(Location location) {

		System.out.println("Sports Car Constructed in !!!"+this.getLocation());
	}

}
