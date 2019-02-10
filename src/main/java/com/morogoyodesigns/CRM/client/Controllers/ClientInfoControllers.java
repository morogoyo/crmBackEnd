package com.morogoyodesigns.CRM.client.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.morogoyodesigns.CRM.client.data.Client;
import com.morogoyodesigns.CRM.client.repositories.ClientRepository;



@RestController
@RequestMapping(value="/customer")
public class ClientInfoControllers {	
	
	@Autowired
	private ClientRepository client;



	@RequestMapping(method = RequestMethod.GET ,value = "/")
	public List<Client> getAllCustomers(){
		return  client.findAll();

	}
	
	@RequestMapping(method = RequestMethod.GET ,value = "/{id}")
	public Optional<Client> getOneCustomer(@PathVariable Long id) {
		return client.findById(id);
	}


	
	@RequestMapping(method = RequestMethod.POST, value="/insert" )
	public void insertCustomer(@RequestBody Client customer) {
		System.out.println(customer.getFName());
		client.save(customer);
		
	}
	@ResponseStatus(code = HttpStatus.OK)
	@RequestMapping(method = RequestMethod.PUT , value = "/update{id}")
    public void updateCustomersInfo(@PathVariable("id") Long id , @RequestBody Client updateCustomer){

		Client customerToUpdate = client.getOne(id);
		System.out.println(customerToUpdate.getFName());
		customerToUpdate.setLName(updateCustomer.getFName());
		customerToUpdate.setFName(updateCustomer.getFName());
		client.save(updateCustomer);


    }

    @RequestMapping(value = "/delete{id}" , method = RequestMethod.DELETE)
    public void deleteCustomer(@PathVariable("id") Long id){

		Client deletedClient = client.getOne(id);
		System.out.println(deletedClient);
		client.deleteById(id);

	}

}
