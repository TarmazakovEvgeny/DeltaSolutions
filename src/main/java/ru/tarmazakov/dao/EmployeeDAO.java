package ru.tarmazakov.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ru.tarmazakov.entity.Employee;


public class EmployeeDAO implements EmployeeDAOLocal{

	@PersistenceContext
    private EntityManager em;
	
	public void addEmployee(Employee employee) {
		em.persist(employee);
	}

	public void editEmployee(Employee employee) {
		em.merge(employee);
	}

	public void deleteEmployee(int employeeId) {
		em.remove(getEmployee(employeeId));
	}

	public Employee getEmployee(int employeeId) {
		return em.find(Employee.class, employeeId);
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees() {
		 return em.createNamedQuery("Employee.getAll").getResultList();
	}

	

}
