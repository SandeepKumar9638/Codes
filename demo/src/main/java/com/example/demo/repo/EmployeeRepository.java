package com.example.demo.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	Employee findByemployeeId(long employeeId);

	List<Employee> findByEmployeeDepartment(String department);

	




}
