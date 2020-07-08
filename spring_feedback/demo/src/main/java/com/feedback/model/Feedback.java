package com.feedback.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cust_id;
	private String cust_name;
	private int cust_rating;
	
	public Feedback() {
		// TODO Auto-generated constructor stub
	}
	
	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public int getCust_rating() {
		return cust_rating;
	}

	public void setCust_rating(int cust_rating) {
		this.cust_rating = cust_rating;
	}
	
}
	


