package com.prowings.creational.singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton obj;

	private ThreadSafeSingleton() {
		super();
	}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		
		if(obj==null) {
			obj = new ThreadSafeSingleton();
		}
		return obj;
	}
	
	
}
