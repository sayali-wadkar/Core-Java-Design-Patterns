package com.prowings.creational.builder;

public class Employee {

	int id;
	String firstName;
	String lastName;
	String dept;
	double salary;
	Address address;
	
	public Employee(EmployeeBuilder emp) {
		super();
		this.id = emp.id;
		this.firstName = emp.firstName;
		this.lastName = emp.lastName;
		this.dept = emp.dept;
		this.salary = emp.salary;
		this.address = emp.address;
		
	}
	public static class EmployeeBuilder{
		
		int id;
		String firstName;
		String lastName;
		String dept;
		double salary;
		Address address;
		public EmployeeBuilder(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public EmployeeBuilder id(int id) {
			this.id = id;
			return this;
		}
		
		public EmployeeBuilder dept(String dept) {
			this.dept = dept;
			return this;
		}
		
		public EmployeeBuilder salary(double salary) {
			this.salary = salary;
			return this;
		}
		
		public EmployeeBuilder salary(Address address) {
			this.address = address;
			return this;
		}
		
		public Employee build() {
			Employee emp = new Employee(this);
			return emp;
		}

	}
		@Override
		public String toString() {
			return "EmployeeBuilder [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dept=" + dept
					+ ", salary=" + salary + ", address=" + address + "]";
		}
	
}
