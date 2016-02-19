package com.guillermods.velocitysample.webapp.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.guillermods.velocitysample.webapp.dto.Test;

@Controller
@RequestMapping("/home")
public class HomeController {

	private Test test;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index(Model model) {
		test = new Test();
		model.addAttribute("test", test);

		return "home/index";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@Valid Test test, BindingResult result, Model model) {
		System.out.println(test.getName());
		System.out.println(test.getAge());
		if (result.hasErrors()) {
			return "home/index";
		}
		return "home/view";
	}

}
