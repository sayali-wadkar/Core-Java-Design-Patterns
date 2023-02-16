package com.prowings.creational.singleton;

public class BillpughSingleton {

	private BillpughSingleton () {
		super();
	}
	
	private static class HelperSingleton{
		private static BillpughSingleton obj = new BillpughSingleton();
	}
	
	public static BillpughSingleton getInstance() {
		return HelperSingleton.obj;
	}
}
