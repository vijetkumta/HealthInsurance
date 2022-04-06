package com.cg.health.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name="PolicyPurchase")

public class PolicyPurchase {
	@Id
	@Column(name="policyPurchaseId")
	@GeneratedValue(strategy= GenerationType.AUTO)

	private long policyPurchaseId;
	
	private long premiumAmount;
	private int policyPuchaseDuration;
	private Date purchaseDate;
	private Date purchaseEndDate;
	@ManyToOne
	@JoinColumn(name="policyId")
private Policy policy;
	@ManyToOne
	@JoinColumn(name="UserId")
	private PolicyUser policyUser;
	
	
	public PolicyPurchase() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getPolicyPurchaseId() {
		return policyPurchaseId;
	}


	public void setPolicyPurchaseId(long policyPurchaseId) {
		this.policyPurchaseId = policyPurchaseId;
	}


	public long getPremiumAmount() {
		return premiumAmount;
	}


	public void setPremiumAmount(long premiumAmount) {
		this.premiumAmount = premiumAmount;
	}


	public int getPolicyPuchaseDuration() {
		return policyPuchaseDuration;
	}


	public void setPolicyPuchaseDuration(int policyPuchaseDuration) {
		this.policyPuchaseDuration = policyPuchaseDuration;
	}


	public Date getPurchaseDate() {
		return purchaseDate;
	}


	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}


	public Date getPurchaseEndDate() {
		return purchaseEndDate;
	}


	public void setPurchaseEndDate(Date purchaseEndDate) {
		this.purchaseEndDate = purchaseEndDate;
	}


	public Policy getPolicy() {
		return policy;
	}


	public void setPolicy(Policy policy) {
		this.policy = policy;
	}


	public PolicyUser getPolicyUser() {
		return policyUser;
	}


	public void setPolicyUser(PolicyUser policyUser) {
		this.policyUser = policyUser;
	}


	public PolicyPurchase(long policyPurchaseId, long premiumAmount, int policyPuchaseDuration, Date purchaseDate,
			Date purchaseEndDate, Policy policy, PolicyUser policyUser) {
		super();
		this.policyPurchaseId = policyPurchaseId;
		this.premiumAmount = premiumAmount;
		this.policyPuchaseDuration = policyPuchaseDuration;
		this.purchaseDate = purchaseDate;
		this.purchaseEndDate = purchaseEndDate;
		this.policy = policy;
		this.policyUser = policyUser;
	}


	@Override
	public String toString() {
		return "PolicyPurchase [policyPurchaseId=" + policyPurchaseId + ", premiumAmount=" + premiumAmount
				+ ", policyPuchaseDuration=" + policyPuchaseDuration + ", purchaseDate=" + purchaseDate
				+ ", purchaseEndDate=" + purchaseEndDate + ", policy=" + policy + ", policyUser=" + policyUser + "]";
	}
}

	