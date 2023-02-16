package com.prowings.creational.singleton;

public class EagerInitialization {

	private static EagerInitialization object = new EagerInitialization();
	
	private EagerInitialization(){
		
		super();
	}
	
	public static EagerInitialization getInstance() {
		
		return object;
	}
}
