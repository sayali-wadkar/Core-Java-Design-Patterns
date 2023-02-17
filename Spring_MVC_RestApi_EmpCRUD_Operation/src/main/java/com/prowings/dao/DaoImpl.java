package com.prowings.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prowings.model.Employee;
@Repository
public class DaoImpl implements EmpDao{

	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public void saveEmployee(Employee emp) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save("Employee", emp);
		tx.commit();
	}


	@Override
	public Employee getEmployeeById(int id) {
		
		Employee emp;
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		emp = session.get(Employee.class, id);
		tx.commit();
		return emp;
	}


	@Override
	public Employee updateEmployee(Employee emp) {
		Employee emp1;
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		emp1 = session.get(Employee.class,emp);
		session.saveOrUpdate(emp1);
		tx.commit();
		return emp1;
	}


	@Override
	public void deleteEmployee(int id) {
		Employee emp;
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		emp = session.get(Employee.class, id);
		session.delete(emp);
		tx.commit();
	}


	@Override
	public List<Employee> getAllEmployee() {
		
		List<Employee> emplist;
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		emplist = session.createQuery("from Employee").list();
		tx.commit();
		return emplist;
	}
	
	
	
	

}
