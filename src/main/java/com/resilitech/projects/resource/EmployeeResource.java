package com.resilitech.projects.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resilitech.projects.model.Employee;

@RestController
public class EmployeeResource {


	
	@GetMapping("/list")
	public List<Employee> getEmployees()
	{
		List<Employee> list = new ArrayList<>();
		
		Employee e1 = new Employee (12345,"Mary Elen","Dallas");
		Employee e2 = new Employee (12346,"john doe","Frisco");
		Employee e3 = new Employee (12347,"tim gaston","plano");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		return list;	
		
	}

}
