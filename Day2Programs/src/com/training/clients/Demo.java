package com.training.clients;

class C
{
	public void m1(int x,int y) { System.out.println("Int sum in C"+(x+y));}
	public void m1(double d1,double d2) {System.out.println("double sum:"+(d1+d2));}
}

class D extends C
{
	public void m1(int x,int y) { System.out.println("Int sum in D "+(x+y));}
}

class E extends C
{
	public void m1(int x,int y) { System.out.println("Int sum in E "+(x+y));}
}

public class Demo {

	public static void main(String[] args) {
		
		C obj=new C();
		obj.m1(12, 14);
		obj.m1(12.5, 12); // early binding or compile time or static binding

		
		obj = new D();
		obj.m1(12, 34); 
		
		obj=new E();
		obj.m1(23, 12);// late binding or runtime or dynamic binding
		
	}

}
