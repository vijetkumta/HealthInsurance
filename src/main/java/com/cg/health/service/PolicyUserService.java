package com.cg.health.service;

import java.util.List;

import com.cg.health.entities.PolicyUser;

public interface PolicyUserService {
	

	public List<PolicyUser> getUsers();

	public PolicyUser addUser(PolicyUser user);
}
