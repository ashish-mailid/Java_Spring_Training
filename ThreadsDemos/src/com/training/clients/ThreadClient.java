package com.training.clients;

import com.training.threads.SeriesGenerator;
import com.training.threads.Thread1;
import com.training.threads.Thread2;

public class ThreadClient {

	public static void main(String[] args) throws InterruptedException {
		
		SeriesGenerator sGenerator =new SeriesGenerator();
		
		/*Thread1 t1=new Thread1(sGenerator);
		t1.setName("Even Thread");
		t1.start(); // run()
		
		Thread2 t2=new Thread2(sGenerator);
		t2.setName(name);	
		t2.start();*/
		
		Thread1 target1 = new Thread1(sGenerator);
		Thread t1 = new Thread(target1,"Even");
		//t1.run();
		t1.start();
		
		Thread2 target2 = new Thread2(sGenerator);
		Thread t2 = new Thread(target2,"Odd");
		//t2.run();
		t2.start();
		
		System.out.println(t1.isAlive()+" "+t2.isAlive());
		
		t1.join(); // main will join t1
		t2.join(); //main will join t2
		
		System.out.println("End of Main Thread");
		System.out.println("End of the program");
		
		System.out.println(t1.isAlive()+" "+t2.isAlive());
	}

}





