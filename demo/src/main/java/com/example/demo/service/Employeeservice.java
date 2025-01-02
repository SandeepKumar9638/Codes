package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class Employeeservice {
@Autowired
EmployeeRepository employeeRepositry;

// post
public Employee createNewEmployee(Employee employee) {
	return  employeeRepositry.save(employee);
	
}

// get all
public List<Employee> getAll() {
	List<Employee> elist = new ArrayList<Employee>();
	employeeRepositry.findAll().forEach(employee -> elist.add(employee));
	return elist;
}

// get by id
public Employee getEmployeeData(long employeeId) {
	
	Employee e = employeeRepositry.findByemployeeId(employeeId);
	return e;
}

//updating

/*public Employee UpdateEmployeeData(double percentageChange, long employeeId) {
	
	Employee employee = employeeRepositry.findByemployeeId(employeeId);
	if (employee != null) {
        String department = employee.getEmployeeDepartment();
        double currentSalary = employee.getEmployeeSalary();
        if("Java".equals(department)){
        	employee.setEmployeeSalary(currentSalary * (1 + percentageChange / 100));
        }
        else if("UI".equals(department)){
        	employee.setEmployeeSalary(currentSalary * (1 - percentageChange/100));
        	
        }
	return employeeRepositry.save(employee);
}
	return null;
}*/

public List<Employee> updateEmployeesInDepartment(String department, double percentageChange) {
	List<Employee> employees = employeeRepositry.findByEmployeeDepartment(department);
	if(employees != null) {
		for (Employee employee : employees) {
			double currentSalary = employee.getEmployeeSalary();
			
			if("Java".equals(department)){
	        	employee.setEmployeeSalary(currentSalary * (1 + percentageChange / 100));
	        }
	        else if("UI".equals(department)){
	        	employee.setEmployeeSalary(currentSalary * (1 - percentageChange/100));
	        	
	        }
		 employeeRepositry.save(employee);
	}
		
		}
	
	return employees;
} 
}
