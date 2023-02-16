package com.prowings.creational.prototype;

public class Student implements Cloneable {

	int roll;
	String name;
	double marks;
	String subject;
	Address address;
	
	public Student() {
		super();
	}
	
	public Student(int roll, String name, Address address, double marks, String subject) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.subject = subject;
		this.address = address;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", Address=" + address + ", marks=" + marks + ", subject="
				+ subject + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Student dum = (Student) super.clone();
		Address add = (Address) dum.getAddress().clone();
		dum.setAddress(add);
		return dum;
	}
	
	
	
}
