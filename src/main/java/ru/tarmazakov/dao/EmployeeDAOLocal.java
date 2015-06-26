package ru.tarmazakov.dao;

import java.util.List;

import ru.tarmazakov.entity.Employee;

public interface EmployeeDAOLocal {

	void addEmployee(Employee student);

	void editEmployee(Employee student);

	void deleteEmployee(int studentId);

	Employee getEmployee(int studentId);

	List<Employee> getAllEmployees();
}
