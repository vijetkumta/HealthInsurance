package com.cg.health.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.health.entities.PolicyUser;
import com.cg.health.service.PolicyUserService;

@RestController
@RequestMapping
public class PolicyUserController {
	@Autowired
	public PolicyUserService userService;
//	@GetMapping("/InsuranceUser")
//	public List<User1> getUsers(){
//		return userService.getUsers() ;
//	}
	@PostMapping("/InsuranceUser")
	public PolicyUser addUser(@RequestBody PolicyUser user){
		return this.userService.addUser(user);
	}
}
