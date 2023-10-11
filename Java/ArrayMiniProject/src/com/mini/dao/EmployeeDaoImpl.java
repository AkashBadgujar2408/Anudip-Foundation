package com.mini.dao;

import com.mini.pojo.Employee;
	
	//dao stands for Data Access Object.

public class EmployeeDaoImpl implements EmployeeDao {
	
	Employee[] empList = new Employee[50];
	int index=0;
	
	@Override
	public boolean addEmployee(Employee e) {
		if (index<50) {
			empList[index] = e;
			index++;
			
			return true;
		}
		return false;
	}

	@Override
	public boolean updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee searchEmployeeById(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee[] showAllEmployees() {
		// TODO Auto-generated method stub
		return empList;
	}

}
