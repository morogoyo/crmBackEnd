package com.morogoyodesigns.CRM.client.data;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "f_name")
	private String fName;
	@Column(name = "l_name")
	private String lName;
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "email")
	private String email;
	@Column(name = "birthday")
	private Date birthday;
	@Column(name = "profession")
	private String profession;
	@Column(name = "home_number")
	private Integer homeNumber;
	@Column(name = "mobile_number")
	private Integer mobileNumber;
	
	@OneToOne
	private Address address;

  
}
