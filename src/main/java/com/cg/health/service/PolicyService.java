package com.cg.health.service;

import java.util.List;

import com.cg.health.entities.Policy;


public interface PolicyService {

	public List<Policy> getPolicies();

	public Policy addPolicies(Policy policy);

	public Policy getPolicyById(int policyId);
}
