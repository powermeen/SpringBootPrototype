package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.constant.PageRegister;
import com.service.UserService;

@Controller
public class LoginController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";
	
	@Autowired
	private UserService userService;

	@RequestMapping("/loginAdmin")
	public String loginAdmin(Map<String, Object> model) {
		model.put("message", this.message);
		
		userService.findUserByEmail("MEEN");
		
		return PageRegister.loginAdmin.getPath();
	}

}