package com.prowings.creational.prototype;

public class TestStudent {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address add = new Address(416,"pune");
		Student std1 = new Student(1, "Sayali", add,82.22, "IT");
		
		Student std2 = (Student) std1.clone();
		std2.setRoll(12);
		std2.setName("Dipali");
		std2.setMarks(73.78);
		std2.setSubject("Hindi");
		Address add1 = new Address(456, "mumbai");
		std2.setAddress(add1);
		System.out.println(std2);
		System.out.println(std2==std1);
	}

}
