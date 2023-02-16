package com.prowings.creational.factory;

public class CarFactory {

	public static Car buildCar(CarType type) {
		
		Car car = null;
		
		switch (type) {
		case LUXURY:
			 car = new Luxury(type) ;
			break;
		case SEDAN:
			car = new Sedan(type) ;
			break;
		case SMALL:
			car = new Small(type) ;
			break;
		case SPORTS:
			car = new Sports(type) ;
			break;
		default:
			System.out.println("Invalid Car Type!!!"+ type);
			break;
		
	}
		return car;
	}
	
}

