package com.prowings.creational.singleton;

public class DoubleCheckLocking {

	private static DoubleCheckLocking obj;

	private DoubleCheckLocking() {
		super();

	}
	
	public static DoubleCheckLocking getInstance() {
		
		if(obj==null) {
			synchronized (DoubleCheckLocking.class) {
				if(obj==null) {
					obj = new DoubleCheckLocking();
				}
			}
		}
		return obj;
	}
	
}
