package com.excelr.Student.Management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.Student.Management.model.Teacher;
import com.excelr.Student.Management.repository.TeacherRepository;

@Service
public class TeacherService {
	

	@Autowired
	TeacherRepository teacherRepository;
	
	public Teacher saveTeacher(Teacher teacher)
	{
		
		 return teacherRepository.save(teacher);

     }

	public List<Teacher> saveMultipleTeacher(List<Teacher> teachers) 
	{
	
		 return teacherRepository.saveAll(teachers);
	
	}

	public List<Teacher> getAllTeachers() {
		
		return teacherRepository.findAll();
	}
	
}

