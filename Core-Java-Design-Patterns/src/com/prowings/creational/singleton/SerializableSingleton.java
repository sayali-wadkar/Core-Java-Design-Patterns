package com.prowings.creational.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable{

	
	private static final long serialVersionUID = 1L;

	private SerializableSingleton() {
		super();
	}

	private static class HelperSingleton {
		private static SerializableSingleton obj = new SerializableSingleton();
	}
	
	public static SerializableSingleton getInstance() {
		return HelperSingleton.obj;
	}
	
	public Object readResolve() {
	      System.out.println("Executing readResolve");
	      return SerializableSingleton.getInstance(); 
	   }
	
}
