package com.training.classes;

public class Employee {
	
		private String name;
		private String email;
		private Car car; // has a relation
		private Address address;
		
		public Employee() {
			
		}
		
		public Employee(String name, String email,Car car) {
			this.name = name;
			this.email = email;
			this.car=car;
		}


		public String getName() {
			return name;
		}
		public void setName(String n) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public Car getCar() {
			return car;
		}

		public void setCar(Car car) {
			this.car = car;
		}
		
		
	
}
