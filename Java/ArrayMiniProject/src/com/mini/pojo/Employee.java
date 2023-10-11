package com.mini.pojo;
/*
 * Java Bean Class or POJO Class (Plain Old Java Object)
 */
public class Employee {

	private int empId;
	private String empName;
	private String designation;
	private double salary;
	
	public Employee() {
		
	}
	public Employee(int empId, String empName, String designation, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getDesignation() {
		return designation;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", salary="
				+ salary + "]";
	}
}

