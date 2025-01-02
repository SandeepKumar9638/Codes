package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;



@RestController
public class StudentController {
	@Autowired
	private StudentRepo studentRepo;
	 @GetMapping("/srikar")
	 public String index() {
		 return "Welcome  Srikar";
	 }
	 // to post the data into db
	 @PostMapping("/saveStudent")
	 public Student saveData(@RequestBody Student student ) {
		 studentRepo.save(student);
		 return student;
		 
	 }
	 //to fetch single record (get)
	 @GetMapping("/getStudent/{id}")
	 public Student getStudentData(@PathVariable long id) {
		 Optional<Student> student = studentRepo.findById(id);
		 if(!student.isEmpty()) {
		 Student student1 = student.get();
		 return student1;
		 }
		 return null;
		 
	 }
	 // to fetch all data (get)
	 @GetMapping("/getAllStudent")
	 public List<Student>getAll(){
		 List<Student> studentList = studentRepo.findAll();
		 return studentList;
	
		 
	 }
	 // to delete a particular record (delete)
	 @DeleteMapping("/deleteStudent/{id}")
	 public String deleteStudent(@PathVariable long id) {
		 Student student = studentRepo.findById(id).get();
		 if(student!= null)
			 studentRepo.delete(student);
		 return "Delete sucess";
		
		 
	 }
	 // to update the data (put)
	 @PutMapping("/updateData")
	 public Student UpdateStudentData(@RequestBody Student student) {
		 studentRepo.save(student);
		 return student;
	 }
	 
	

	 
	 }
