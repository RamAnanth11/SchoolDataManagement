package com.school.sdm.service;

import java.util.List;

import com.school.sdm.dto.Admin;

public interface AdminService {
	Admin AdminLogin(String email, String password);

	String saveAdmin(Admin admin);

	String updateAdmin(Admin admin);

	String getAdminById(int id);

	List<Admin> getAllAdmin();

	Admin deleteAdminById(int id);
}