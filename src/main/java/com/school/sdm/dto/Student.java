package com.school.sdm.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	private Integer id;
	private String name;
	private String email;
	private Integer std;
	private String sec;
	private Date dob;
	private String throughOutPercentage;
	private String password;
}