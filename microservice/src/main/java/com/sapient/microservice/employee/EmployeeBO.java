package com.sapient.microservice.employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class EmployeeBO {

	static List<Employee> list = new ArrayList<Employee>();
	static {
		list.add(new Employee(1,"Darshit","London"));
		list.add(new Employee(2,"Harshit","London"));
		list.add(new Employee(3,"Arshit","London"));
	}
	public void addEmployee(Employee e) {
		list.add(e);
	}
	
	public int addEmployee(int id, String name, String city)
	{
		list.add(new Employee(id,name,city));
		return id;
	}
	
	public List<Employee> showEmployee(){
		return list;
	}
	public Employee showEmployee(int id) {
		for(Employee e: list)
		{
			if(e.id==id)
				return e;
		}
		return null;
	}
	
	public void deleteEmployee(int id) {
		Iterator<Employee> i = list.iterator();
		while(i.hasNext()) 
		{
			if(i.next().id ==id)
			{
				i.remove();
			}
		}
	}
	public Employee updateEmployee(int id) {
		for(Employee e:list)
		{
			if(e.getId()==id)
			{
				e.setName("Updated");
				e.setCity("Updated");
				return e;
				
			}
		}
		return null;
		
	}

	public Employee showEmployeeByName(String name) {
		for(Employee obj:list) 
		{
			if(obj.getName().equals(name))
			{
				return obj;
			}
		}
		return null;
	}
	
}
