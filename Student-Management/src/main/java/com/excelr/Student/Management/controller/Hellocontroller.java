package com.excelr.Student.Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.Student.Management.model.Student;
import com.excelr.Student.Management.service.StudentService;



@RestController


public class Hellocontroller {
	
	@Autowired
	StudentService studentService;

	@GetMapping("/hello")
	public String hello()
	{
		return"welcome to project session";
	}
	@GetMapping("/test")
	public String test()
	{
		return"java springboot";
	}
	@GetMapping("/saveStudent")
	public String saveStudent()
	{
		Student s1=new Student(18,"Virat",78.5);
		studentService.savestudent(s1);
		return "Record Saved Successfully";
	}

	@PostMapping("/saveStudentUsingRequestParam")
	public String saveStudentUsingRequestParam(
	  @RequestParam("a") int rno,
	  @RequestParam("b") String sname,
	  @RequestParam("c") double per
	)
	
	{
		Student s1=new Student(rno,sname,per);
		studentService.savestudent(s1);
		return "Record saved successfully";
	}
	
	@PostMapping("/saveStudentByPathvariable/{a}/{b}/{c}")
	public String saveStudentByPathvariable(
	  @PathVariable("a") int rno,
	  @PathVariable("b") String sname,
	  @PathVariable("c") double per
	)
	
	{
		Student s1=new Student(rno,sname,per);
		studentService.savestudent(s1);
		return "Record saved successfully";
	}
	@PostMapping("/saveStudentByRequestBody")
	public String saveStudentByRequestBody(
	   @RequestBody Student s1
	   )
	{
		
		studentService.savestudent(s1);
		return "Record saved successfully";
	}
	
	@GetMapping("/getAllStudents") 
	public List<Student> getAllStudents()
	{
		return studentService.getAllStudents();
	}
	
	@GetMapping("/getStudentByRno/{a}") 
	public Student getStudentByRno(@PathVariable("a") int rno)
	{
		return studentService.getStudentByRno(rno);
	}
	
	@PutMapping("/updateStudent/{a}") 
	public String getStudentByRno(@PathVariable("a") int rno,@RequestBody Student newValues)
	{
		
		studentService.updateStudent(rno,newValues);
		return "Update successfull";
	}
	@DeleteMapping("/deleteStudent/{a}") 
	public String deleteStudent(@PathVariable("a") int rno)
	{
		
		studentService.deleteStudent(rno);
		return "Delete successfull";
	}
	
	
} 
