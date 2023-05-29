package com.school.sdm.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.omg.PortableInterceptor.ACTIVE;

import com.school.sdm.dto.Admin;
import com.school.sdm.util.AppConstance;
import com.school.sdm.util.ConnectionUtil;

public class AdminDAOImp implements AdminDAO {
	Connection con = null;

	public static void main(String[] args) {
		AdminDAOImp ad = new AdminDAOImp();
		System.out.println(ad.saveAdmin(new Admin(3, "ARMN", "ARMN", "master","123")));
		System.out.println(ad.deleteAdminById(3));

	}

	@Override
	public Admin adminLogin(String email, String password) {
		String query = AppConstance.ADMIN_LOGIN;
		Admin a = null;

		try {
			con = ConnectionUtil.getConnection();
			System.out.println("Connected!");
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, password);

			ResultSet set = ps.executeQuery();
			while (set.next()) {
				a = new Admin();
				a.setId(set.getInt(1));
				a.setName(set.getString(2));
				a.setEmail(set.getString(3));
				a.setDept(set.getString(4));
				a.setPassword(set.getString(5));
			}
			con.close();
			return a;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String saveAdmin(Admin admin) {
		String query = AppConstance.ADMIN_SAVE;
		con = ConnectionUtil.getConnection();
		System.out.println("COnnected!");

		try {
			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, admin.getId());
			ps.setString(2, admin.getName());
			ps.setString(3, admin.getEmail());
			ps.setString(4, admin.getDept());
			ps.setString(5, admin.getPassword());

			int update = ps.executeUpdate();
			con.close();
			return update + " number of lines added";

		} catch (SQLException e) {
			e.printStackTrace();
			return "Duplicated Values have been found";
		}
	}

	/**
	 *
	 */
	@Override
	public String updateAdmin(Admin admin) {
		String query = AppConstance.ADMIN_UPDATE;
		con = ConnectionUtil.getConnection();
		System.out.println("Connected!");

		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, admin.getPassword());
			ps.setInt(2, admin.getId());

			int update = ps.executeUpdate();
			con.close();
			return update + " number of rows updated and password echanged";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "No number of lines updaterd";
		}
	}

	@Override
	public Admin getAdminById(int id) {
		String query = AppConstance.ADMIN_GETADMINBYID;
		con = ConnectionUtil.getConnection();
		Admin a = null;
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet set = ps.executeQuery();
			while (set.next()) {
				a = new Admin();
				a.setId(set.getInt(1));
				a.setName(set.getString(2));
				a.setEmail(set.getString(3));
				a.setDept(set.getString(4));
				a.setPassword(set.getString(5));
			}
			con.close();
			return a;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Admin> getAllAdmin() {
		String query = AppConstance.ADMIN_GETALLADMIN;
		con = ConnectionUtil.getConnection();
		List<Admin> list = null;
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet set = ps.executeQuery();
			
			if(set.isBeforeFirst())
			{
				list = new ArrayList<Admin>();
				while(set.next())
				{
					Admin a = new Admin();
					a.setId(set.getInt(1));
					a.setName(set.getString(2));
					a.setEmail(set.getString(3));
					a.setDept(set.getString(4));
					a.setPassword(set.getString(5));
					list.add(a);
				}
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Admin deleteAdminById(int id) {
		String query = AppConstance.ADMIN_DELETEADMIN;
		con = ConnectionUtil.getConnection();
		System.out.println("Connected");
		Admin a = new Admin();
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet set = ps.executeQuery();
			if (set.isBeforeFirst()) {
				while(set.next())
				{
					a.setId(set.getInt(1));
					a.setName(set.getString(2));
					a.setEmail(set.getString(3));
					a.setDept(set.getString(4));
					a.setPassword(set.getString(5));
				}	
			}
			return a;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
