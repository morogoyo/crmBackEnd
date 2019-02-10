package com.morogoyodesigns.CRM.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morogoyodesigns.CRM.client.data.Address;



public interface ClientAddressRepository extends JpaRepository<Address, Integer> {	
	
	
	
}
