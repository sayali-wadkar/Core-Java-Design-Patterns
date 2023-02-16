package com.prowings.creational.singleton;

public class LazyInitialization {

	private static LazyInitialization obj =null;

	private LazyInitialization() {
		super();

	}
	
	public static LazyInitialization getInstance() {
		if(obj==null) {
			obj = new LazyInitialization();
		}
		return obj;
	}
	
}
