package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	

	public List<Employee> getAllEmployees() {
		
		List<Employee> employeeList = new ArrayList<>();
		employeeRepository.findAll().forEach(employeeList::add);
		return employeeList;

	}
	public Employee getEmployee(String language) {
		return employeeRepository.findByLanguage(language);
		
	}
	public Employee addEmployee(Employee employee){ 
		 return employeeRepository.save(employee);
		
	}
	public void updateEmployee(String language,  Employee employee) {
		employeeRepository.save(employee);
		
	}
	
	public void deleteEmployee(int id) {
		 employeeRepository.deleteById(id);
		
	}

}
