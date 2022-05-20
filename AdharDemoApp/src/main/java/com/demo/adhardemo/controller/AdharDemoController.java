package com.demo.adhardemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.adhardemo.entity.Adhar;
import com.demo.adhardemo.entity.Schemes;
import com.demo.adhardemo.service.AdharDemoService;

@RestController
@RequestMapping("/adhar")
public class AdharDemoController {
	
	@Autowired
	private AdharDemoService service;
	
	
	@PostMapping("/save")
	public String creatNewAdhar(@RequestBody Adhar adhar) {
		service.saveApplicant(adhar);
		return "Succefully Created";
	}
	@GetMapping("/find/{name}")
	public Adhar getAdharDetails(@PathVariable("name") String name) {
		return service.getAdharByName(name);
	}
	
	@PostMapping("/schemes/save")
	public String schems(@RequestBody Schemes scheme) {
		service.saveScheme(scheme);
		return "Scheme Succefully Created";
	}
	
	@GetMapping("/getscheme/{name}")
	public List<Schemes> getSchems(@PathVariable("name") String name) {
		return service.getSchemeDetails(name);
		
	}
	
	

}
