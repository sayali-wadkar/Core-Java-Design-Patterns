package com.prowings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.model.Employee;
import com.prowings.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	EmpService service;
	
	@GetMapping("/hello")
	public @ResponseBody  String hello() {
		
		return ("hello java developer Sayali !!!");
	}
	
	@PostMapping("/employees/save")
	public  @ResponseBody String saveEmployee(@RequestBody Employee emp) {
		
		 service.saveEmployee(emp);
		 
		 return ("Employee Successfully Stored !!!");
	}

	@GetMapping("/employees/{id}")
	public @ResponseBody Employee getEmployeeById(@PathVariable ("id") int id) {
		
		return service.getEmployeeById(id);
	}
	
	@PutMapping("/employees/update")
	public @ResponseBody Employee updateEmployee (@RequestBody Employee emp) {
		
		return service.updateEmployee(emp);
	}
	
	@DeleteMapping("employees/delete/{id}")
	public @ResponseBody String deleteEmployee(@PathVariable ("id") int id) {
		
		service.deleteEmployee(id);
		
		return ("Employee Information Removed!!!");
	}

	@GetMapping("/employees/list")
	public @ResponseBody List<Employee> getAllEmployee()
	{
		return service.getAllEmployee();
	}






}
