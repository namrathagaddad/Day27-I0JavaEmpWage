package com.javaioday27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day27EmployeePayrollService {

	List<Day27EmployeePayroll> day27employeePayrollList;
	
	public Day27EmployeePayrollService() {
		day27employeePayrollList = new ArrayList<>();
}
	public static void main(String[] args) {
		Day27EmployeePayrollService service = new Day27EmployeePayrollService();
		
		service.readInputFromConsole();
		service.writeOpToConsole();
}
	public void readInputFromConsole() {
		Scanner consoleScn = new Scanner(System.in);
		System.out.println("Enter the Employee Id : ");
		int id = consoleScn.nextInt();
		
		System.out.println("Enter the Employee Name : ");
		String name = consoleScn.next();
		
		System.out.println("Enter the Employee Salary : ");
		double salary = consoleScn.nextDouble();
		consoleScn.close();
		day27employeePayrollList.add(new Day27EmployeePayroll(id, name, salary));
	}
	public void writeOpToConsole() {
		System.out.println("All Employee Payroll details : "+day27employeePayrollList);
	}
}

/*Enter the Employee Id : 
11775453
Enter the Employee Name : 
Namratha
Enter the Employee Salary : 
2500000
All Employee Payroll details : [Day27EmployeePayroll11775453 [name=Namratha,salary=2500000.0]]
*/