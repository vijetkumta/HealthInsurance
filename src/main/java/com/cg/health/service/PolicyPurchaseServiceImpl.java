package com.cg.health.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.health.dao.PolicyPurchaseDao;
import com.cg.health.entities.PolicyPurchase;

@Service
public class PolicyPurchaseServiceImpl implements PolicyPurchaseService {

	@Autowired
	private PolicyPurchaseDao policyPurchaseDao;
	
	@Override
	public List<PolicyPurchase> getPolicyPurchase() {
		// TODO Auto-generated method stub
		return policyPurchaseDao.findAll();
	}

	@Override
	public PolicyPurchase addPolicyPurchase(PolicyPurchase policyPurchase) {
		// TODO Auto-generated method stub
		return policyPurchaseDao.save(policyPurchase);
	}

}
