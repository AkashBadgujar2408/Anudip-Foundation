package com.mini.dao;

import com.mini.pojo.Employee;

	//dao stands for Data Access Object.

public interface EmployeeDao {
	public boolean addEmployee(Employee e);
	public boolean updateEmployee(Employee e);
	public boolean deleteEmployee(Employee e);
	
	public Employee searchEmployeeById(int empid);
	public Employee[] showAllEmployees();
}