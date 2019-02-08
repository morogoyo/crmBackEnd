package com.morogoyodesigns.CRM.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.morogoyodesigns.CRM.company.data.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company , Integer>{

}
