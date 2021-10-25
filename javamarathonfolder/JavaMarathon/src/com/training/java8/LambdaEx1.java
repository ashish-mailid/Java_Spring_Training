package com.training.java8;

public class LambdaEx1 {

	public static void main(String[] args) {
		Runnable r1=()->{
			for(int i=0;i<=5;i++) {
				System.out.println("Thread:"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}

		};
		new Thread(r1).start();
	}

}
