package com.pky.controller;


import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pky.model.User;

@Controller
public class UserController {
	private static final Logger logger=org.slf4j.LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value = {"/","/createUserAcc"} ,method = RequestMethod.GET)
	public String loadUserForm(Model model) {
		model.addAttribute("user", new User());
		return "createUserAcc";
	}
	
	
	@RequestMapping(value = "/creatUser", method =RequestMethod.POST)
	public String createUser(@ModelAttribute("user") User user ,RedirectAttributes attributes) {
		
		logger.info("User form submited ::"+user);
	//	model.addAttribute("msg"," User Added Successfully ");
		attributes.addFlashAttribute("msg"," User Added Successfully ");
		return "redirect:/userAccCreationSucc";
		
	}
	
	@RequestMapping(value = "userAccCreationSucc" ,method = RequestMethod.GET)
	public String userAccCreationSucc(Model model) {
		logger.info("usercreationSucc() method called");
		model.addAttribute("user", new User());
		return "createUserAcc";
	}
}
