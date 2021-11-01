package onetomany;

import java.util.List;
import java.util.Map;

public class Customer {
	private String firstName;
	private String lastName;
	private String email;
	private long id;
	//List<Complaint> complaints;
	Map<Integer,Complaint> complaints;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", id=" + id + ", complaints="
				+ complaints + "]";
	}
	public void setId(long id) {
		this.id = id;
	}
	/*public List<Complaint> getComplaints() {
		return complaints;
	}
	public void setComplaints(List<Complaint> complaints) {
		this.complaints = complaints;
	}*/
	public Map<Integer, Complaint> getComplaints() {
		return complaints;
	}
	public void setComplaints(Map<Integer, Complaint> complaints) {
		this.complaints = complaints;
	}
	
}
