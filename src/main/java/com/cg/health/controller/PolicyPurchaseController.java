package com.cg.health.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.health.entities.PolicyPurchase;
import com.cg.health.service.PolicyPurchaseService;

@RestController
@RequestMapping("/health")
public class PolicyPurchaseController {
	@Autowired
	public PolicyPurchaseService policyPurchaseService;
	
	@GetMapping("/policyPurchase")
	public List<PolicyPurchase> getPolicyPurchase(){
		return this.policyPurchaseService.getPolicyPurchase();
	}
	@PostMapping("/policyPuurchase")
	public PolicyPurchase addPolicyPurchase(@RequestBody PolicyPurchase policyPurchase){
		return this.policyPurchaseService.addPolicyPurchase(policyPurchase);
	}

}
