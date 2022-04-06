package com.cg.health.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.health.entities.Policy;
import com.cg.health.service.PolicyService;

@RestController
@RequestMapping("/health")
public class PolicyController {
	@Autowired
	public PolicyService policyService;
	
	@GetMapping("/policies")
	public List<Policy> getPolicies(){
		return policyService.getPolicies();
	}
	@PostMapping("/policies")
	public Policy addPolicies(@RequestBody Policy policy){
		return policyService.addPolicies(policy);
	}
	@GetMapping("/policies/{policyId}")
	public Policy getPolicyById(@PathVariable int policyId){
		return policyService.getPolicyById(policyId);
	}
		
//	@GetMapping("/findemp/{id}")
//    public Policy getPolicyById(@PathVariable int policyId){
//        
//        return policyService.findById(policyId);
//    }
// user/admin view all policies 
//	getAllPolicies()
//	getPolicyByPolicyId()
}