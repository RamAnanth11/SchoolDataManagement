package com.school.sdm.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
	private Integer id;
	private String name;
	private String email;
	private String subject;
	private Date dateOfJoining;
	private String password;
	private Double sal;
	private String classTeacher;

}