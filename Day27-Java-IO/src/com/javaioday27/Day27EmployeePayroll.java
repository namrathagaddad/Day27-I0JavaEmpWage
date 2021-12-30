package com.javaioday27;

public class Day27EmployeePayroll {
	
	int id;
	String name;
	double salary;
	
	public Day27EmployeePayroll(int id, String name, double salary) {
		this.id= id;
		this.name = name;
		this.salary= salary;
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Day27EmployeePayroll" + id + " [name="+name+",salary="+ salary +"]";
	}
}
