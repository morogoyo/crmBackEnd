package com.morogoyodesigns.CRM.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morogoyodesigns.CRM.client.data.Client;



public interface ClientRepository extends JpaRepository<Client, Integer> {	
	
	
	
}
