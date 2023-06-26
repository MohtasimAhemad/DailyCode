package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;


@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id) throws Exception {
        return employeeRepository.findById(id)
            .orElseThrow(() -> new Exception("Employee not found with id " + id));
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(int id, Employee employeeDetails) throws Exception {
        Employee employee = getEmployeeById(id);

        employee.setName(employeeDetails.getName());
        employee.setSalary(employeeDetails.getSalary());

        return employeeRepository.save(employee);
    }

    public void deleteEmployee(int id) throws Exception {
        employeeRepository.delete(getEmployeeById(id));
    }
}