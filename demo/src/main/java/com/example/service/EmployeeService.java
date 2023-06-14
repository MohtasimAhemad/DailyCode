package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private  final EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository)
	{
		this.employeeRepository = employeeRepository;
		
	}
	
	public List<Employee> getAllEmployee()
	{
		return employeeRepository.findAll();
	}
	

	public Employee getEmployeeById(String id)
	{
		return employeeRepository.findById(id).orElseThrow();
	}
	
	public Employee createEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	
	public Employee updateEmployee(String id,Employee updateEmployee)
	{
		Employee employee=getEmployeeById(id);
		employee.setName(updateEmployee.getName());
		employee.setSalary(updateEmployee.getSalary());
		return employeeRepository.save(employee);
	}
	
	
	public void deleteEmployee(String id)
	{
		employeeRepository.deleteById(id);
	}
}
