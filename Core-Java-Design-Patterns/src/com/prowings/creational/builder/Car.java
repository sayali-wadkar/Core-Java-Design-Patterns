package com.prowings.creational.builder;

import lombok.Builder;
import lombok.NonNull;

@Builder

public class Car {
	
	int no;
	@NonNull
	String name;
	double price;
	double mileage;
	@NonNull
	String company;
	
}
