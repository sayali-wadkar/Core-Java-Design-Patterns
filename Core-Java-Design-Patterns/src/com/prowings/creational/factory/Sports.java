package com.prowings.creational.factory;

public class Sports extends Car{

	public Sports(CarType carType) {
		super(carType);
		construct();
	}

	@Override
	public void construct() {

		System.out.println("Sports Car Constructed!!!");
	}

}
