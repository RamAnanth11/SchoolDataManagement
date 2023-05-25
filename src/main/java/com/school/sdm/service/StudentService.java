package com.school.sdm.service;

import java.util.List;

import com.school.sdm.dto.Student;

public interface StudentService {
	Student studentLogin(String email, String password);

	String saveStudent(Student student);

	String updateStudent(Student student);

	String getStudentById(int id);

	List<Student> getAllStudent();

	Student deleteStudentById(int id);
	
	List<Student> sortedByName();
	
	List<Student> sortedByClass();
	
	List<Student> sortedByThroughOutPercentage();
}