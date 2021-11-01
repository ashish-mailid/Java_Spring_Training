package com.training.onetomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long custId;
	private String custName;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "custId")  // foreign key
	private List<Complaint> compliants;
	
	
	public long getCustId() {
		return custId;
	}
	
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public List<Complaint> getCompliants() {
		return compliants;
	}

	public void setCompliants(List<Complaint> compliants) {
		this.compliants = compliants;
	}

	public Customer(String custName) {
		super();
		this.custName = custName;
	}

	public Customer() {
		super();
	}

	
		

}
