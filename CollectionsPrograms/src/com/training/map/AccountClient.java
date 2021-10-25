package com.training.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class AccountClient {

	public static void main(String[] args) {
		AccountDemo accountDemo = new AccountDemo();
		
		while(true)
		{
		System.out.println("1. admin");
		System.out.println("2. User");
		System.out.println("0. exit");
		System.out.println("Enter 1 or 2 or 0");
		Scanner sc=new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
				
				System.out.println("1. add account");
				System.out.println("2. View accounts");
				System.out.println("3. remove account");
				System.out.println("4. activate/deactivate");
				
				System.out.println("0. Go to the main menu");
				int option = sc.nextInt();
				switch(option)
				{
				case 1:
				
					System.out.println("Enter username,email");
					Account newAccount = new Account(sc.next(), "abcd", sc.next(), true);
					if(accountDemo.addAccount(newAccount))
					System.out.println("New Account Created for "+newAccount.getUsername());
					else
						System.out.println("Account not created");
				break;
				
				case 2:
					print(accountDemo.getAccounts());
					break;
				
				case 3:
					System.out.println("Enter username for deletion");
					accountDemo.removeAccount(sc.next());
					
					break;
					
				case 4:
					System.out.println("Enter username for deletion");
					accountDemo.changeStatus(sc.next());
					break;
					
				case 0: break;	
				}
				break;
		case 2:
				System.out.println("USER");
				System.out.println("Enter Username and password");
				String accountStatus = accountDemo.validate(sc.next(),sc.next());
				System.out.println(accountStatus);
				
				break;
		case 0:
				System.exit(0);
		}
		
		}
	
	}

	private static void print(Map<String, Account> accounts) {
		
		Set<Entry<String,Account>> accounts1 = accounts.entrySet();
		for(Entry<String,Account> entry:accounts1)
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}






