package com.prowings.creational.abstractfactory;

public class TestFactory {

	public static void main(String[] args) {

		Car car1 = AsiaCarFActory.builderCar(CarType.LUXURY);
		
		Car car2 = DefaultCarFactory.builderCar(CarType.SEDAN);
		
		Car car3 = DefaultCarFactory.builderCar(CarType.SMALL);
		
		Car car4 = DefaultCarFactory.builderCar(CarType.SPORTS);
		
}
}
