package com.school.sdm.util;

public interface AppConstance {
	String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	String URL = "jdbc:mysql://localhost:3306/";
	String USER_NAME = "root";
	String PASSWORD = "root";
	String VALID_USER_MESSAGE = "";
	String INVALID_USER_MESSAGE = "";
	String SECRET_KEY = "11091998Ananth12061999Neha=143@26012023";

	String ADMIN_LOGIN = "SELECT * FROM admin WHERE email = ? AND password = ?";
}