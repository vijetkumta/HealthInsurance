package com.cg.health.service;

import java.util.List;

import com.cg.health.entities.PolicyPurchase;

public interface PolicyPurchaseService {

	public List<PolicyPurchase> getPolicyPurchase(); 
		
	

	public PolicyPurchase addPolicyPurchase(PolicyPurchase policyPurchase); 

	
}
