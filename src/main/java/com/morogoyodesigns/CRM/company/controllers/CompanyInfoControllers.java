package com.morogoyodesigns.CRM.company.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.morogoyodesigns.CRM.client.repositories.ClientRepository;
import com.morogoyodesigns.CRM.company.data.Company;
import com.morogoyodesigns.CRM.company.data.CompanyAddress;
import com.morogoyodesigns.CRM.company.repository.CompanyRepository;

import ch.qos.logback.core.net.server.Client;



@RestController
@RequestMapping(value="/company")
public class CompanyInfoControllers {
	
	@Autowired
	private CompanyRepository companyRepo;
	
	@Autowired
	private ClientRepository clientRepo;
	
	@RequestMapping(value="/all", method=RequestMethod.GET , produces = "application/json")
	public List<Company> getAllCompanies() {
		List<Company> allCompanies = companyRepo.findAll();
		return allCompanies;
	}
	
	
	@RequestMapping(value="/insert" , method=RequestMethod.POST ,produces ="application/json")
	public void insertCustomer(@RequestBody Company company) {		
//		company.setId(id);
//		company.getCompanyAddress().setCompanyAddressId(id);
		companyRepo.save(company);
		
	}
	
	// when editing company info the client id should be passed in to the url in order for 
	// it to be looked up and update the right company
	@RequestMapping(value="/update" , method=RequestMethod.PUT)
	public void updateCustomer(@RequestBody Company company) {
//		Company companyId = companyRepo.getOne(id);
//		companyId = company;
		companyRepo.save(company);		 
		
	}
	

}
