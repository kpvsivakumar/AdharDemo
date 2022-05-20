
package com.demo.adhardemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.adhardemo.entity.Adhar;
import com.demo.adhardemo.entity.Schemes;
import com.demo.adhardemo.repository.AdharRepository;
import com.demo.adhardemo.repository.SchemesRepository;

@Service
public class AdharDemoService {

	@Autowired
	private AdharRepository repo;
	
	@Autowired
	private SchemesRepository schemesRepository;

	public void saveApplicant(Adhar adhar) {
		repo.save(adhar);
	}

	public Adhar getAdharByName(String name) {
		return repo.findByName(name);

	}
	
	public void saveScheme(Schemes schemes) {
		schemesRepository.save(schemes);
	}
	
	public List<Schemes> getSchemeDetails(String name) {
		return schemesRepository.findByName(name);

	}

}
