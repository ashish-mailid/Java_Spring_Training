package com.training.threads;

//public class Thread2 extends Thread{     // is a Thread
	public class Thread2  implements Runnable{ // Runnable target

	private SeriesGenerator sGenerator;
	
	public Thread2(SeriesGenerator sGenerator) {
		this.sGenerator=sGenerator;
	}

	public void run()
	{
		sGenerator.odd();
	}
}
