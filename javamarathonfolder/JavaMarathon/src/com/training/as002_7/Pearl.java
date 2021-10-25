package com.training.as002_7;

public class Pearl {
	
	private String color;
	private String size;
	private String shape;
		
	public Pearl() {
		super();
	}

	public Pearl(String color, String size, String shape) {
		super();
		this.color = color;
		this.size = size;
		this.shape = shape;
	}


	public String toString()
	{
		return color+" "+shape+" "+size;
	}

}
