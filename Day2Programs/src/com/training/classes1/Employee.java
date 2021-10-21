package com.training.classes1;

public class Employee extends Person{

	private long empId;
	private double basic;
	public Employee(String name, String dob, long empId, double basic) {
		super(name,dob);
		this.empId = empId;
		this.basic = basic;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	
	
	
}
