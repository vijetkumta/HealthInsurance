package com.cg.health.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.health.dao.AdminDao;
import com.cg.health.entities.Admin;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDao adminDao;

	@Override
	public List<Admin> getAdmin() {
		// TODO Auto-generated method stub
		return adminDao.findAll();
	}

	@Override
	public Admin addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.save(admin);
	}

	@Override
	public Admin getAdminById(int id) {
		// TODO Auto-generated method stub
		return adminDao.getById(id);
	}

	

}
