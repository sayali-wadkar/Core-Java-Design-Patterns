package com.prowings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowings.dao.EmpDao;
import com.prowings.model.Employee;
@Service
public class ServiceImpl implements EmpService {

	@Autowired
	EmpDao dao;
	
	@Override
	public void saveEmployee(Employee emp) {

		 dao.saveEmployee(emp);
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		return dao.getEmployeeById(id);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		
		return dao.updateEmployee(emp);
	}

	@Override
	public void deleteEmployee(int id) {

		dao.deleteEmployee(id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return dao.getAllEmployee();
	}

}
