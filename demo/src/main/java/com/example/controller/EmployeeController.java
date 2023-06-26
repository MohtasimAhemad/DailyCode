package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
 public class EmployeeController {

	@Autowired
	private final EmployeeService employeeService;
	public EmployeeController(EmployeeService employeeService)
	{
		this.employeeService=employeeService;
	}
	
	@GetMapping("/employee")
	public List<Employee> getEmployees()
	{
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getById(@PathVariable int id) throws Exception
	{
		return employeeService.getEmployeeById(id);
	}
	
	@PostMapping("/addEmployee")
	public Employee addEmployees(@RequestBody Employee employee)
	{
		return employeeService.createEmployee(employee);
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployeeBYId(@PathVariable int id) throws Exception
	{
		employeeService.deleteEmployee(id);
	}
	
}
