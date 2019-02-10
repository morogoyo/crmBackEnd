package com.morogoyodesigns.CRM.company.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "company")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Company implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "company_id")
	private Long id;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "company_address")
	private String address;
	
	@Column(name = "company_email")
	private String email;
	
	@Column(name = "company_description")
	private String description;
	
	@Column(name = "company_phone_number")
	private Long companyPhoneNumber;
	
	@Column(name = "date_added")
	@CreationTimestamp
	private Date dateAdded;
	
	@Column(name = "date_updated")
	@UpdateTimestamp
	private Date dateUpdated;
	
	@OneToOne(mappedBy="company",cascade=CascadeType.ALL)
	
	private CompanyAddress companyAddress;

}
