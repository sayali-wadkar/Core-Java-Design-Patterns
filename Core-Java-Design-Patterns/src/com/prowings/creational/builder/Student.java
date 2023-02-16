package com.prowings.creational.builder;

public class Student {

	int id;
	String firstName;
	String lastName;
	int std;
	String subject;
	double marks;
	Address address;

	public Student(StudentBuilder emp) {
		super();
		this.id = emp.id;
		this.firstName = emp.firstName;
		this.lastName = emp.lastName;
		this.std = emp.std;
		this.subject = emp.subject;
		this.marks = emp.marks;
		this.address = emp.address;
	}

	public static class StudentBuilder {

		int id;
		String firstName; // mandatory
		String lastName; // mandatory
		int std;
		String subject;
		double marks;
		Address address;

		public StudentBuilder(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public StudentBuilder id(int id) {
			this.id = id;
			return this;
		}

		public StudentBuilder std(int std) {
			this.std = std;
			return this;
		}

		public StudentBuilder subject(String sub) {
			this.subject = sub;
			return this;
		}

		public StudentBuilder marks(double marks) {
			this.marks = marks;
			return this;
		}

		public StudentBuilder address(Address add) {
			this.address = add;
			return this;
		}

		public Student build() {

			Student std = new Student(this);
			return std;
		}

	}

		@Override
		public String toString() {
			return "StudentBuilder [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", std=" + std
					+ ", subject=" + subject + ", marks=" + marks + ", address=" + address + "]";
		}

}
