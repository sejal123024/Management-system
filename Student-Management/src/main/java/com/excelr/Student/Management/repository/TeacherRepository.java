package com.excelr.Student.Management.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.Student.Management.model.Teacher;



@Repository

public interface TeacherRepository extends JpaRepository<Teacher,Integer>
{

}
