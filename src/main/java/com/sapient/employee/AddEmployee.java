package com.sapient.employee;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {

	
	static List<Employee> list = new ArrayList<Employee>();
	
	
	public void AddEmployee(Employee emp) {
		list.add(emp);
	}
	
	
	public Employee getEmployee(int id) {
		for(Employee e:list) {
			if(e.getId()==id) {
				return e;
			}
		}
		return null;		
	}
	
}
