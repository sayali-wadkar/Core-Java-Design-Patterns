package com.prowings.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		EagerInitialization obj = EagerInitialization.getInstance();
		EagerInitialization obj1 = null;
		
		Constructor[] constructors =obj.getClass().getDeclaredConstructors();
		
		for(Constructor con :constructors) {
			
			con.setAccessible(true);
			obj1 = (EagerInitialization) con.newInstance();
		}
		System.out.println(obj==obj1);
	}

}
