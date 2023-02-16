package com.prowings.creational.singleton;

public class StaticBlockInitialization {

	private static StaticBlockInitialization obj;

	private StaticBlockInitialization() {
		super();
	}
	
	static {
		
		try {
			obj = new StaticBlockInitialization();
		}
		catch (Exception e) {
			System.out.println("Exception while initializing the object!!");
		}
	}
	
	public static StaticBlockInitialization getInstance() {
		return obj;
	}
	
	
	
}
