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

import com.projects.fleet.models.Country;
import com.projects.fleet.services.CountryService;

@Controller
@RequestMapping("/countries")
public class CountryController {

	@Autowired
	private CountryService countryService;

	// Get All Countries
	@GetMapping("")
	public String findAll(Model model) {
		model.addAttribute("countries", countryService.findAll());
		return "country";
	}

	@GetMapping("/findById")
	@ResponseBody
	public Optional<Country> findById(Integer id) {
		return countryService.findById(id);
	}

	// Add Country
	@PostMapping(value = "/addNew")
	public String addNew(Country country) {
		countryService.save(country);
		return "redirect:/countries";
	}

	@RequestMapping(value = "/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(Country country) {
		countryService.save(country);
		return "redirect:/countries";
	}

	@RequestMapping(value = "/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String delete(Integer id) {
		countryService.delete(id);
		return "redirect:/countries";
	}
}
