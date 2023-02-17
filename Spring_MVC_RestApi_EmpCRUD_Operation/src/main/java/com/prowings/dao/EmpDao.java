package com.prowings.dao;

import java.util.List;

import com.prowings.model.Employee;

public interface EmpDao {

	public void saveEmployee(Employee emp);

	public Employee getEmployeeById(int id);

	public Employee updateEmployee(Employee emp);

	public void deleteEmployee(int id);

	public List<Employee> getAllEmployee();

}
