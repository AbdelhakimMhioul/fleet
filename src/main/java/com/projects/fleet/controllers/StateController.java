package com.projects.fleet.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.projects.fleet.models.State;
import com.projects.fleet.services.CountryService;
import com.projects.fleet.services.StateService;

@Controller
@RequestMapping("/states")
public class StateController {

	@Autowired
	private StateService stateService;
	@Autowired
	private CountryService countryService;

	// Get All States
	@GetMapping("")
	public String findAll(Model model) {
		model.addAttribute("states", stateService.findAll());
		model.addAttribute("countries", countryService.findAll());
		return "state";
	}

	@GetMapping("/findById")
	@ResponseBody
	public Optional<State> findById(Integer id) {
		return stateService.findById(id);
	}

	// Add State
	@PostMapping(value = "/addNew")
	public String addNew(State state) {
		stateService.save(state);
		return "redirect:/states";
	}

	@RequestMapping(value = "/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(State state) {
		stateService.save(state);
		return "redirect:/states";
	}

	@RequestMapping(value = "/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String delete(Integer id) {
		stateService.delete(id);
		return "redirect:/states";
	}
}
