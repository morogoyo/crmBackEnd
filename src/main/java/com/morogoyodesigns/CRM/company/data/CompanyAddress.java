package com.morogoyodesigns.CRM.company.data;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "company_address")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CompanyAddress implements Serializable{	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "company_address_id")
	private Long companyAddressId;
	
	@Column(name = "buildingNumber")
	private Integer buildingNumber;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "county")
	private String county;
	
	@Column(name = "po_box")
	private String poBox;
	
	
	@OneToOne(fetch = FetchType.LAZY, optional = false,cascade=CascadeType.ALL)
	@JoinColumn(name = "company_address_id", nullable = false)
	@JsonIgnore
	private Company company;
	

}
