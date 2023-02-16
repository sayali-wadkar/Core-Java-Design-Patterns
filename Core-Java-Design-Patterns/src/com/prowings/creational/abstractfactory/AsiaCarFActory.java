package com.prowings.creational.abstractfactory;

public class AsiaCarFActory {

	public static Car builderCar(CarType type) {
		
		Car car = null;
		switch(type) {
		case LUXURY:
			car = new Luxury(Location.ASIA);
			break;
		case SEDAN:
			car = new Small(Location.ASIA);
			break;
		case SMALL:
			car = new Sedan(Location.ASIA);
			break;
		case SPORTS:
			car = new Sports(Location.ASIA);
			break;
		default:
			System.out.println("invaild location");
			break;
		
		}
		return car;
		
	}
}
