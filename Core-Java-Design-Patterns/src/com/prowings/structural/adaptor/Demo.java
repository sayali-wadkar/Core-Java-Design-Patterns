package com.prowings.structural.adaptor;

public class Demo {

	int id;
	String name;
	double salary;
	
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Demo(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public static void main(String[] args) {

		Demo d1 = new Demo(10, "Sayali", 123.009);
		
		Demo d2 = new Demo(10, "Sayali", 123.009);
		
//		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
	}

	@Override
	public boolean equals(Object obj) {
		if(this == null)
			return false;
		
		if(this==obj)
			return true;
		
		if(obj instanceof Demo) {
			Demo d = (Demo) obj;
			return id==d.id && name.equals(d.name) && salary == d.salary; 
		}
		else
		return false;
	}

	

}
