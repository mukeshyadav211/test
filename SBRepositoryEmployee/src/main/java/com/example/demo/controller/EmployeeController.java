package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	/* GET method */
	@RequestMapping("/employees")
	public List<Employee> getAllEmployee() {

		return employeeService.getAllEmployees();
	}

	/* POST method */
	@RequestMapping(method = RequestMethod.POST, value = "/employee/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		System.out.println("add emp");
		return employeeService.addEmployee(employee);

	}

	/* PUT METHOD */
	@RequestMapping(method = RequestMethod.POST, value = "/employees/{id}/language")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable String language) {
		employeeService.updateEmployee(language, employee);
	}

	/* DELETE METHOD */
	@RequestMapping(method = RequestMethod.POST, value = "/employees/delete/{id}")
	public void deleteEmployee(@PathVariable int Id) {
		employeeService.deleteEmployee(Id);
	}

}
