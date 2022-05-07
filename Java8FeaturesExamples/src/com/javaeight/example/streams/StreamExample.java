package com.javaeight.example.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {

	// List of employees---->get highest salary--->print the employee name whos
	// salary is highest
	public static void main(String args[]) {
		Employee employee=new Employee("Ravi","50000000");
		Employee employee1=new Employee("Teja","60000000");
		Employee employee2=new Employee("Tamu","70000000");
		Employee employee3=new Employee("Krishna","80000000");

		List<Employee> list = new ArrayList<Employee>();
		list.add(employee);
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		//System.out.println(list.toString());
		list.stream().filter(emp->emp.getSalary()=="80000000").forEach(emp->System.out.println(emp.getName()));
		
	}
	
}
