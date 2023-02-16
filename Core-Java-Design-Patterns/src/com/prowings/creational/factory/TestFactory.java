package com.prowings.creational.factory;

public class TestFactory {

	public static void main(String[] args) {

		Car car1 = CarFactory.buildCar(CarType.LUXURY);
		
		Car car2 = CarFactory.buildCar(CarType.SMALL);
		
		Car car3 = CarFactory.buildCar(CarType.SEDAN);
		
		Car car4 = CarFactory.buildCar(CarType.SPORTS);
	}

}
