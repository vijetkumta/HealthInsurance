package com.cg.health.service;

import java.util.List;

import com.cg.health.entities.Admin;

public interface AdminService {

	public List<Admin> getAdmin();

	public Admin addAdmin(Admin admin);

	public Admin getAdminById(int id);

}
