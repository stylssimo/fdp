package com.ficus.dictionary.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ficus.dictionary.domain.User;
import com.ficus.dictionary.form.Message;
import com.ficus.dictionary.service.UserService;

@Controller()
@RequestMapping("/users")
public class UserController {
	
	final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private MessageSource messageSource;
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register(Model uiModel){
		User user = new User();
		uiModel.addAttribute("user", user);
		//uiModel.addAttribute("roles", "roles");
		return "user-register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String doRegister(@Valid User user, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest, RedirectAttributes redirectAttributes, Locale locale){
		logger.info("Creating user");
		if(bindingResult.hasErrors()){
			uiModel.addAttribute("message", new Message("error", messageSource.getMessage("user_save_fail", new Object[]{}, locale)));
			uiModel.addAttribute("user", user);
		}
		uiModel.asMap().clear();
		redirectAttributes.addFlashAttribute("message", new Message("success", messageSource.getMessage("user_save_success", new Object[]{}, locale)));
		userService.save(user);
		//System.out.print(user.getEmail());
		return "redirect:/users/register";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(){
		return "user-login";
	}
}
