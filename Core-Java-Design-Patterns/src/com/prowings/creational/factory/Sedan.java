package com.prowings.creational.factory;

public class Sedan extends Car{

	public Sedan(CarType carType) {
		super(carType);
		construct();
	}

	@Override
	public void construct() {

		System.out.println("Sedan Car Constructed!!!");
	}

}
