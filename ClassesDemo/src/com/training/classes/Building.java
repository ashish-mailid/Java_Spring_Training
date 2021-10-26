package com.training.classes;

public  class Building {
	private String name;

	public Building() {
		super();
	}

	public Building(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	static int y=10;
	
		public class Room{
			private double area=100;
			private String name="abc";
			public  void m1(String name)
			{
				System.out.println("area="+area);
				System.out.println(name+" "+this.name+" "+Building.this.name);
				getName();
			}
			
		}

		public static class Room1{
			private double area=100;
			private String name="abc";
			public  void m1(String name)
			{
				System.out.println("area="+area);
				System.out.println(name+" "+this.name+" ");
				//getName(); // error
			}
			
		}

}





