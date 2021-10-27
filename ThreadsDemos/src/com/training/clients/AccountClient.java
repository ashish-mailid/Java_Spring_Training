package com.training.clients;

import com.training.classes.Account;

public class AccountClient {

	public static void main(String[] args) {
		Account acc = new Account(12345, 2000);

		//subclass of Thread

		Thread partner2 = new Thread("partner2")
		{
			public void run()
			{
				acc.withdraw(1500);
			}
		};
		partner2.start();
		
		
		Thread partner1 = new Thread("partner1")
		{
			public void run()
			{
				acc.deposit(1500);
			}
		};
		partner1.start();

		
		Thread partner3 = new Thread("partner3")
		{
			public void run()
			{
				acc.getAdvice();
			}
		};
		partner3.start();



	}

}
