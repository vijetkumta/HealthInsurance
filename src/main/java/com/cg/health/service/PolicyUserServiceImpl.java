package com.cg.health.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.health.dao.PolicyUserDao;
import com.cg.health.entities.PolicyUser;

@Service
public class PolicyUserServiceImpl implements PolicyUserService {
	
    @Autowired
	private PolicyUserDao userDao; 
	@Override
	public List<PolicyUser> getUsers() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}
	@Override
	public PolicyUser addUser(PolicyUser user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}
 
}
