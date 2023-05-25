package com.school.sdm.repository;

import java.util.List;

import com.school.sdm.dto.Student;

public interface StudentDAO {
	Student studentLogin(String email, String password);

	String saveStudent(Student student);

	String updateStudent(Student student);

	String getStudentById(int id);

	List<Student> getAllStudent();

	Student deleteStudentById(int id);

}