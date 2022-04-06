package com.cg.health.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.health.dao.PolicyDao;
import com.cg.health.entities.Policy;

@Service
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	private PolicyDao policyDao;
	//List<Policy> list;
	
//	public PolicyServiceImpl() {
	
//	list=new ArrayList<>();
//	list.add(new Policy(101,"Individual Health Insurance",200000,2));
//	list.add(new Policy(102,"Senior Citizen",300000,2));
//	}

	@Override
	public List<Policy> getPolicies() {
		
		return policyDao.findAll();
	}

	@Override
	public Policy addPolicies(Policy policy) {
		//list.add(policy);
	return	policyDao.save(policy);
		//return policy;
	}

	@Override
	public Policy getPolicyById(int policyId) {
		// TODO Auto-generated method stub
		return policyDao.getById(policyId);
	}
 
	
}
