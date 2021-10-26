package com.training.classes;


abstract class Shape
{
	public abstract void area();
}


public class LocalClassDemo1 {

	/*
	 * class Triangle extends Shape {
	 * 
	 * @Override public void area() { System.out.println("Area of Triangle");
	 * 
	 * }
	 * 
	 * }
	 */
	
	public void m1()
	{
		class Triangle extends Shape
		{

			@Override
			public void area() {
				System.out.println("Area of Triangle");
				
			}
			
		}
		
		
		Triangle t1=new Triangle(); t1.area();
	}
	public static void main(String[] args) {
		
		/*
		 * Shape shape = new LocalClassDemo1().new Triangle(); shape.area();
		 */

		new LocalClassDemo1().m1();
				
		//class Rectangle extends Shape
		Shape r = new Shape()
		{
			@Override
			public void area() {
				System.out.println("Area of Rectangle");
				
			}
			
		};
		
		r.area();
		
	}

}







