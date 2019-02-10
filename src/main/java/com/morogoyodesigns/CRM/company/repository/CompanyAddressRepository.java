package com.morogoyodesigns.CRM.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.morogoyodesigns.CRM.company.data.Company;
import com.morogoyodesigns.CRM.company.data.CompanyAddress;

@Repository
public interface CompanyAddressRepository extends JpaRepository<CompanyAddress , Integer>{

}
