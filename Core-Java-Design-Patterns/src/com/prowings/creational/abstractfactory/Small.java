package com.prowings.creational.abstractfactory;

public class Small extends Car {

	public Small(Location location) {
		super( CarType.SMALL,location);
		construct(location);
	}

	@Override
	public void construct(Location location) {

		System.out.println("Small car constructed in !!!"+this.getLocation());
	}

}
