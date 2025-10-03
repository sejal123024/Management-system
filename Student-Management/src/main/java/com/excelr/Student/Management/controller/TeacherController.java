package com.excelr.Student.Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.Student.Management.model.Teacher;
import com.excelr.Student.Management.service.TeacherService;

@RestController
//provide the raw data on postman
public class TeacherController {

	
	@Autowired
	TeacherService teacherService;
	
	//create-postmapping
	
	@PostMapping("/saveTeacherByRequestBody")
	public Teacher saveTeacherByRequestBody(@RequestBody Teacher  teacher)
	{
			return teacherService.saveTeacher(teacher);
			 
	}
	@PostMapping("/saveMultipleTeacher")
	public List<Teacher> saveTeacher(@RequestBody List<Teacher>  teachers)
	{
			return teacherService.saveMultipleTeacher(teachers);
			 
	}
	@GetMapping("/getAllTeachers")
	public List<Teacher> getAllTeachers()
	{
			return teacherService.getAllTeachers();
			 
	}
	
	

}
