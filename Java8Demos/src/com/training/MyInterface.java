package com.training;

@FunctionalInterface
public interface MyInterface {
	
	public void add(int x,int y);
	
	public default void default1() {
		System.out.println("This is a default implementation");
	}
	
	public static void staticMethod()
	{
		System.out.println("This is a static method");
	}
}
