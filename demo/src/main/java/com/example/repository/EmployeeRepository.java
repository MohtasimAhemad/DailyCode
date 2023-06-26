package com.example.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String> {

	Optional<Employee> findById(int id);

}