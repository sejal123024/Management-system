package com.excelr.Student.Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.excelr.Student.Management.model.Teacher;
import com.excelr.Student.Management.service.TeacherService;

@Controller
//Display on web page 
public class TeacherControllerFrontend {
	@Autowired
	TeacherService teacherService;

	@GetMapping("/test1")
	public String test(Model model)
	{
		
		Teacher teacher=new Teacher(10,"seju",45,900);
		model.addAttribute("teacher1",teacher);
		return"test";
	}
	@GetMapping("/teacherRegistrationForm")
	public String teacherRegistrationForm(Model model)
	{
		Teacher teacher=new Teacher();
		model.addAttribute("teacher",teacher);
		return "teacher-registration-form";
	}
	
	@GetMapping("/readTeacherDetailsFromUI")
	public String readTeacherDetailsFromUI(@ModelAttribute Teacher teacher)
	{
		Teacher teacher1=teacherService.saveTeacher(teacher);
//		System.out.println(teacher);
		return "confirm";
	}
	
	
	
}


