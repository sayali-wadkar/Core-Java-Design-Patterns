package com.prowings.service;

import java.util.List;

import com.prowings.model.Employee;

public interface EmpService {

	public void saveEmployee(Employee emp);

	public Employee getEmployeeById(int id);

	public Employee updateEmployee(Employee emp);

	public void deleteEmployee(int id);

	public List<Employee> getAllEmployee();
}
