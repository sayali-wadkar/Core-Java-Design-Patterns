package com.prowings.creational.abstractfactory;

public class DefaultCarFactory {

	public static Car builderCar(CarType type) {
		
		Car car = null;
		switch(type) {
		case LUXURY:
			car = new Luxury(Location.DEFAULT);
			break;
		case SEDAN:
			car = new Small(Location.DEFAULT);
			break;
		case SMALL:
			car = new Sedan(Location.DEFAULT);
			break;
		case SPORTS:
			car = new Sports(Location.DEFAULT);
			break;
		default:
			System.out.println("invaild location");
			break;
		
		}
		return car;
		
	}
}
