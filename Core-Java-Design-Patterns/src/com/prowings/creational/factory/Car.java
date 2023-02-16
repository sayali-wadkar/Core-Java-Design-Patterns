package com.prowings.creational.factory;

public abstract class Car {

	private CarType carType;

	public Car(CarType carType) {
		super();
		this.carType = carType;
		arrangeParts();
	}
	
	public void arrangeParts() {
		System.out.println("parts Arranged for : "+this.carType);
	}

	public abstract void construct();
	
	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}
	
	
	
}
