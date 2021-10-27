package com.training;

public class TestClient{

	public static void main(String[] args) {
		
		/*MyInterface myInt = new MyInterface()
				{
					@Override
					public void add() {
					System.out.println("add");
						
					}
			
				};
		}*/
		
		MyInterface myInt = (int x,int y)->System.out.println("sum="+(x+y));
		myInt.add(12,13);
		
		myInt.default1();
		MyInterface.staticMethod();

	
}
}
