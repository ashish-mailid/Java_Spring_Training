package com.training.classes;
public class Account {
	private long accNo;
	private double balance;
	public Account() {
		super();
	}
	public Account(long accNo, double balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}
	public /*synchronized*/ void withdraw(double amount)
	{
		test();
		System.out.println(Thread.currentThread().getName()+" Request Taken");
		
		synchronized(this) {
		System.out.println("Processing......");
		if(balance-amount >= 500)
		{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		balance = balance-amount;
		System.out.println("Done");
		System.out.println("Balance:"+balance);
		}
		
		else
			System.out.println("Insufficient balance");
	}}
	
	public synchronized void deposit(double amount)
	{
		test();
		System.out.println(Thread.currentThread().getName()+" Request Taken");
		System.out.println("Processing......");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		balance = balance+amount;
		System.out.println("Done");
		System.out.println("Balance:"+balance);
	}
	
	private void test() {
		System.out.println("Some initial statements");
		System.out.println("Promotions and offers");
		System.out.println("Our services");
		
	}
	public  void getAdvice()
	{
		System.out.println("Your Account Details");
		System.out.println("Acc no:"+accNo);
		System.out.println("Balance:"+balance);
	}
	
}







