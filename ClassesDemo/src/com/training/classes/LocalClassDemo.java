package com.training.classes;

abstract class A
{
	public void m1() {System.out.println("m1 A");}
	public abstract void m2();
}

class B 
{
	class C extends A
	{
		public void m1() {System.out.println("m1 C");}
		public void m2() {System.out.println("m2 C");}
		public void m3() {System.out.println("m3 C");}
	}
	
}

public class LocalClassDemo {

	public static void main(String[] args) {
		
		A cObj = new B().new C();
		cObj.m1();
		
		cObj.m2();
		((B.C)cObj).m3();

	}

}
