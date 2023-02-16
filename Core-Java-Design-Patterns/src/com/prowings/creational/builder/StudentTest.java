package com.prowings.creational.builder;

public class StudentTest {

	public static void main(String[] args) {

		Address add = new Address(421, "pune", "india");
		
		Student std = new Student.StudentBuilder("Sayali", "wadkar")
				.address(add)
				.id(1)
				.subject("English")
				.build();
		
		System.out.println(std);
		
		Address add1 = new Address(425, "kolhapur", "india");
		
		Student std1 = new Student.StudentBuilder("dipali", "wadkar")
				.address(add1)
				.id(1)
				.marks(89.34)
				.std(12)
				.subject("English")
				.build();
		
		System.out.println(std1);
		
		Employee emp = new Employee.EmployeeBuilder("Arati", "bhosale")
				.dept("Canteen")
				.id(101)
				.salary(1200.48)
				.build();
		
		System.out.println(emp);
		
		Car car = new Car.CarBuilder()
				.mileage(45.5)
				.no(9216)
				.build();
		System.out.println(car);
	}

}
