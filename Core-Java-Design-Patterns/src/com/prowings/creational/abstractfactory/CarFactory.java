package com.prowings.creational.abstractfactory;

public class CarFactory {

	public static Car buildCar(CarType type ,Location location) {
		
		Car car = null;
		
		switch(location) {
		case ASIA:
			car = new AsiaCarFActory().builderCar(type);
			break;
		case DEFAULT:
			car = new USCarFActory().builderCar(type);
			break;
		case Us:
			car = new DefaultCarFactory().builderCar(type);
			break;
		default:
			System.out.println("invaild car !!!");
			break;
		
		}
		return car;
	}
}

