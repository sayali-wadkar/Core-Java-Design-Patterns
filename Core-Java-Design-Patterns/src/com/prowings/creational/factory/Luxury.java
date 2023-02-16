package com.prowings.creational.factory;

public class Luxury extends Car{

	public Luxury(CarType carType) {
		super(carType);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Luxury car Constructed!!!");		
	}

}
