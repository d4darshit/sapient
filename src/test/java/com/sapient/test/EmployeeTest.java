package com.sapient.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sapient.employee.AddEmployee;
import com.sapient.employee.Employee;;

class EmployeeTest {

	private AddEmployee ob;
	Employee t;
	@BeforeEach	
	public void setAddEmployeeObject() {

		ob = new AddEmployee();
		ob.AddEmployee(new Employee(1,"Darsh","DEL"));
		ob.AddEmployee(new Employee(2,"Darshit","NYC"));
		ob.AddEmployee(new Employee(1,"Harsh","ADI"));
		
	}

	@Test
	public void checkAddedEmployeeReturnEmployeeId() {
		t	= new Employee(4,"Emanuel","RJT");
		ob.AddEmployee(t);
		assertEquals(t, ob.getEmployee(4));
	}
	
	@AfterEach
	public void destroyAddEmployeeObject()
	{
		ob = null;
		t = null;
	}


}
