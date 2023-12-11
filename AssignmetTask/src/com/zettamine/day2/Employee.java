package com.zettamine.day2;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract  class Employee {

	protected int empId;
	protected String empName;
	protected double salary;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public abstract void calculateSalary();

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
}