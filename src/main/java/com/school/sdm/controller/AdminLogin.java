package com.school.sdm.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.school.sdm.dto.Admin;
import com.school.sdm.repository.AdminDAO;
import com.school.sdm.repository.AdminDAOImp;
import com.school.sdm.util.AppConstance;

@WebServlet("/adminlogin")
public class AdminLogin extends HttpServlet {
	public AdminLogin(String userName, String passWord) {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AdminDAO dao = null;
		String userName = req.getParameter(AppConstance.USER_NAME);
		String passWord = req.getParameter(AppConstance.PASSWORD);

		HttpSession session = req.getSession();
		
		Admin admin = dao.adminLogin(userName, passWord);
		
		System.out.println(admin);
		
		if(admin.getId()!=null)
		{
			if(admin.getDept().equals("master")) {
				session.setAttribute("master", admin);
				RequestDispatcher rd = req.getRequestDispatcher("masteradmin.jsp");
				rd.forward(req, resp);
			}
			else {
				session.setAttribute("admin", admin);
				RequestDispatcher rd = req.getRequestDispatcher("admin.jsp");
				rd.forward(req, resp);
			}
		}
		
		
		
	}
}
