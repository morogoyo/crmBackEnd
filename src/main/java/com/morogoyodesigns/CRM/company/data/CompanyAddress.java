package com.morogoyodesigns.CRM.company.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
public class CompanyAddress {	
	
	@Id
	@Column(name = "company_address_id")
	private Integer companyAddressId;
	
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
	
	
	@OneToOne
	@MapsId
	private Company companyAddress;
	

}
