package com.sapient.microservice.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeBO e;
	
	@GetMapping("/employees")
	public List<Employee> showEmployees() {
		return e.showEmployee();
	}	
	@PostMapping("/addemployee")
	public Employee addEmployee(@RequestBody Employee obj) {
		e.addEmployee(obj);
		return obj;
	}
	@PutMapping("updateemployee/{id}")
	public Employee updateEmployee(@PathVariable int id) {
		return  e.updateEmployee(id);
		
	}
	@GetMapping("/employees/{id}")
	public Employee showEmployee(@PathVariable int id) {
		return e.showEmployee(id);
	}
	@GetMapping("employeesbyname/{name}")
	public Employee showEmployeeByName(@PathVariable String name) {
		return e.showEmployeeByName(name);
	}
	@DeleteMapping("deleteemployee/{id}")
	public void deleteEmployee(@PathVariable int id) {
		e.deleteEmployee(id);
	}
	
	
	
	
	
	
	

}
