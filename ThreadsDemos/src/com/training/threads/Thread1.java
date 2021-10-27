package com.training.threads;

//public class Thread1 extends Thread{
	
	public class Thread1 implements Runnable{

	private SeriesGenerator sGenerator;
	
	public Thread1(SeriesGenerator sGenerator) {
		this.sGenerator=sGenerator;
	}

	public void run()
	{
		sGenerator.even();
	}
}
