package com.prowings.creational.abstractfactory;

public abstract class Car {

	private CarType carType;
	private Location location;

	public Car(CarType carType,Location location) {
		super();
		this.carType = carType;
		this.location = location;
		arrangeParts();
	}
	
	public void arrangeParts() {
		System.out.println("parts Arranged for : "+this.carType);
	}

	public abstract void construct(Location location);
	
	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
}
