package com.prowings.creational.singleton;

public class TestSingleton {

	public static void main(String[] args) {

		EagerInitialization obj1 = EagerInitialization.getInstance();
		EagerInitialization obj2 = EagerInitialization.getInstance();
		
		System.out.println(obj1==obj2);
		
		StaticBlockInitialization obj3 = StaticBlockInitialization.getInstance();
		StaticBlockInitialization obj4 = StaticBlockInitialization.getInstance();
		
		System.out.println(obj3==obj4);
		
		LazyInitialization obj5 = LazyInitialization.getInstance();
		LazyInitialization obj6 = LazyInitialization.getInstance();
		
		System.out.println(obj5==obj6);
		
		ThreadSafeSingleton obj7 =ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton obj8 =ThreadSafeSingleton.getInstance();
		
		System.out.println(obj7==obj8);
		
		DoubleCheckLocking obj9 = DoubleCheckLocking.getInstance();
		DoubleCheckLocking obj10 = DoubleCheckLocking.getInstance();
		
		System.out.println(obj10==obj9);
		
		BillpughSingleton obj11 = BillpughSingleton.getInstance();
		BillpughSingleton obj12 = BillpughSingleton.getInstance();
		
		System.out.println(obj12==obj11);
		
		EnumSingleton obj13 = EnumSingleton.INSTANCE;
		EnumSingleton obj14 = EnumSingleton.INSTANCE;
		
		System.out.println(obj13==obj14);
		
		SerializableSingleton obj15 = SerializableSingleton.getInstance();
		SerializableSingleton obj16 = SerializableSingleton.getInstance();
		
		System.out.println(obj15==obj16);
	}

}
