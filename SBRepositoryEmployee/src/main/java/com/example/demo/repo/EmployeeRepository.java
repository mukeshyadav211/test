package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	Employee findByLanguage(String language);
}
