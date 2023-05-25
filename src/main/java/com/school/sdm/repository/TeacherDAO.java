package com.school.sdm.repository;

import java.util.List;

import com.school.sdm.dto.Teacher;

public interface TeacherDAO {
	Teacher TeacherLogin(String email, String password);

	String saveTeacher(Teacher teacher);

	String updateTeacher(Teacher teacher);

	String getTeacherById(int id);

	List<Teacher> getAllTeacher();

	Teacher deleteTeacherById(int id);
}