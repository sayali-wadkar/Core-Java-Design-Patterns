package com.prowings.creational.factory;

public class Small extends Car {

	public Small(CarType carType) {
		super(carType);
		construct();
	}

	@Override
	public void construct() {

		System.out.println("Small car constructed!!!");
	}

}
