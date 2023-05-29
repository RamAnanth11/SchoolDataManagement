package com.school.sdm.util;

public interface AppConstance {
	String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	String URL = "jdbc:mysql://localhost:3306/";
	String DB_USER_NAME = "root";
	String DB_PASSWORD = "root";
	String VALID_USER_MESSAGE = "";
	String INVALID_USER_MESSAGE = "";
	String SECRET_KEY = "11091998Ananth12061999Neha=143@26012023";
	String USER_NAME = "username";
	String PASSWORD = "password";
	String ADMIN_LOGIN = "SELECT * FROM admin WHERE email = ? AND password = ?";
	String ADMIN_SAVE = "INSERT INTO ADMIN VALUES (?,?,?,?,?);";
	String ADMIN_UPDATE = "UPDATE ADMIN SET password = ? WHERE id = ?;";
	String ADMIN_GETADMINBYID = "SELECT * FROM ADMIN WHERE id = ?;";
	String ADMIN_GETALLADMIN = "SELECT * FROM ADMIN;";
	String ADMIN_DELETEADMIN = "DELETE FROM ADMIN WHERE id = ?";
}