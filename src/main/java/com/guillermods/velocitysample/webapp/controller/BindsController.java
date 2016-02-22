package com.guillermods.velocitysample.webapp.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guillermods.velocitysample.webapp.dto.InputSample;

@Controller
@RequestMapping("/binds")
public class BindsController {

	private InputSample inputSample;

	private Map<String, String> items;

	public BindsController() {
		items = new HashMap<>();
		items.put("a", "Fist Element");
		items.put("b", "Second Element");
		items.put("c", "Third Element");
		items.put("d", "Fourth Element");
	}

	@RequestMapping(value = "/inputSample", method = GET)
	public String bindInputGet(Model model) {
		inputSample = new InputSample();
		model.addAttribute("inputSample", inputSample);
		model.addAttribute("items", items);

		return "binds/samples";
	}

	@RequestMapping(value = "/inputSample", method = POST)
	public String bindInputPost(@Valid InputSample inputSample, BindingResult result, Model model) {

		String input = inputSample.getSampleProperty();
		String checks = Arrays.toString(inputSample.getCheckedElemnts());
		String select = inputSample.getSelectedOption();
		String multiSelect = Arrays.toString(inputSample.getSelectedOptions());
		String textArea = inputSample.getDescription();
		String radio = inputSample.getSelectedRadio();

		if (result.hasErrors()) {

			System.out.println("input: " + input);
			System.out.println("checks: " + checks);
			System.out.println("select: " + select);
			System.out.println("multiSelect: " + multiSelect);
			System.out.println("textArea: " + textArea);
			System.out.println("radio: " + radio);

			model.addAttribute("items", items);
			return "binds/samples";
		}

		return "binds/view_input";
	}
}
