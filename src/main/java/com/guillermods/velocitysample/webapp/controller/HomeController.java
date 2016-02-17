package com.guillermods.velocitysample.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.guillermods.velocitysample.webapp.dto.Test;

@Controller
@RequestMapping("/home")
public class HomeController {

	private Test test;
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String index(Model model){
		test = new Test("Guillermo");
		model.addAttribute("test", test);
		return "home/index";
	}
	
	
	@RequestMapping(value = "/save", method=RequestMethod.POST)
	public String save(@ModelAttribute Test test, Model model){		
		model.addAttribute("test",test );

		return "home/view";
	}

}


