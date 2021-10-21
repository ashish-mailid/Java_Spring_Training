package com.training.clients;

import com.training.classes.Car;
import com.training.classes.Employee;

public class EmpDemo {

	public static void main(String[] args) {
		
		Employee sam = new Employee();  // calls the defualt constructor
		System.out.println(sam.getName()+" "+sam.getEmail());
				
		Car car1 = new Car("Blue", "Alto");
		
		Employee peter = new Employee("peter","pet@gmail.com",car1);
		
		System.out.println(peter.getName()+" "+peter.getEmail()+" "+peter.getCar().getColor()+" "+peter.getCar().getModel());
		
		peter.setEmail("peter@gmail.com");
		peter.setName("Peterson");
		
		Car car2 = new Car("red", "hyundai");
		peter.setCar(car2);
		
		System.out.println(peter.getName()+" "+peter.getEmail()+" "+peter.getCar().getColor()+" "+peter.getCar().getModel());
		
	}
}
