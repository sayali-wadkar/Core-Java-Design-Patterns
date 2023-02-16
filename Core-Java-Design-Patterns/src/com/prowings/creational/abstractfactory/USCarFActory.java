package com.prowings.creational.abstractfactory;

public class USCarFActory {

	public static Car builderCar(CarType type) {
		
		Car car = null;
		switch(type) {
		case LUXURY:
			car = new Luxury(Location.Us);
			break;
		case SEDAN:
			car = new Small(Location.Us);
			break;
		case SMALL:
			car = new Sedan(Location.Us);
			break;
		case SPORTS:
			car = new Sports(Location.Us);
			break;
		default:
			System.out.println("invaild location");
			break;
		
		}
		return car;
		
	}
}
