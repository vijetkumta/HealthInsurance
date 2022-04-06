package com.cg.health.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.health.entities.Admin;
import com.cg.health.service.AdminService;

@RestController
@RequestMapping("/health")
public class AdminController {
	@Autowired
	public AdminService adminService;
	
	@GetMapping("/admins")
	public List<Admin> getAdmin(){
		return adminService.getAdmin();
	}
	@PostMapping("/admins")
	public Admin addAdmin(@RequestBody Admin admin){
		return adminService.addAdmin(admin);
	}
	
	@GetMapping("/admins/{id}")
	public Admin getAdminById(@PathVariable int id){
		return adminService.getAdminById(id);
	}
//validate/login Admin
}