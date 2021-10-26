package com.training.clients;

import com.training.interfaces.MyInterface;

public class MyClient {

	public static void main(String[] args) {
	
		MyInterface i1 = new MyInterface()
				{
					@Override
					public void genSeries() {
						for(int i=2;i<=20;i+=2)
							System.out.print(i+" ");
						
					}
			
				};
		
			i1.genSeries();
	}

}
