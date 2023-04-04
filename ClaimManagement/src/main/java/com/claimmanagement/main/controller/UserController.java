package com.claimmanagement.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.claimmanagement.main.entity.User;
import com.claimmanagement.main.service.UserServicesImpl;

import jakarta.validation.Valid;

@Controller
@RequestMapping(path="/aafinsurance/admin")
public class UserController {
	
	@Autowired
	UserServicesImpl service;
	
	@GetMapping("/login")
	public String adminLogin(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}
	
	@PostMapping("/login")
	public String adminLoginProcess(@Valid @ModelAttribute("user") User user,org.springframework.validation.BindingResult br, Model m) {
		if(br.hasErrors()) {
			System.out.println("Binding result");
			System.out.println(br);
			return "login";
		}
		else {
			if(service.authenticate(user)) {
				m.addAttribute("success_msg", "User authenticated !!");
				m.addAttribute("userdetail", service.fetchByUsername(user.getUserName()));
				return "profile";
			}
			else {
				m.addAttribute("error_msg", "User Not available !!");
			}
			return "login";
		}
		
	}

}
