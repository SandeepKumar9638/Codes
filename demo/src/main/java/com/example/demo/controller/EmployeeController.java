package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.Employeeservice;

@RestController
public class EmployeeController {
	@Autowired
	Employeeservice eservice;
	@PostMapping("/employee")
	public Employee createNewEmployee(@RequestBody Employee employee) {
		return eservice.createNewEmployee(employee);
		
		}
	@GetMapping("/getEmployee")
	public List<Employee> getAll(){
		return eservice.getAll();
	}
	
	@GetMapping("/getEmployee/{employeeId}")
	public Employee getEmployeeData(@PathVariable long employeeId){
		return eservice.getEmployeeData(employeeId);
	}
//	@PutMapping("/UpdateEmployee/{employeeId}/{percentageChange}")
////	public Employee UpdateEmployeeData(@PathVariable double percentageChange, @PathVariable long employeeId ) {
////		return eservice.UpdateEmployeeData(percentageChange,employeeId);	
////}
	 @PutMapping("/UpdateByDepartment/{department}/{percentageChange}")
    public List<Employee> updateEmployeesInDepartment(@PathVariable String department, @PathVariable double percentageChange) {
        return eservice.updateEmployeesInDepartment(department, percentageChange);
    }
	 
}
