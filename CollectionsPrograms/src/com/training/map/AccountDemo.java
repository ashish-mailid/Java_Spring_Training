package com.training.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AccountDemo {

	private Map<String,Account> accounts;

	public AccountDemo()
	{
		accounts = new TreeMap<>();
		accounts.put("abc", new Account("abc", "abcd", "abc@gmail.com", true));
	}

	public boolean addAccount(Account account)
	{
		if(!accounts.containsKey(account.getUsername()))
		{
			accounts.put(account.getUsername(), account);
			return true;
		}
		return false;

	}

	public Map<String,Account> getAccounts()
	{
		return accounts;
	}

	public boolean removeAccount(String username) {
		Account accountDeleted = accounts.get(username);
		if(accountDeleted!=null)
		{
			accounts.remove(username); return true;
		}
		return false;
	}

	public boolean changeStatus(String username) {
		Account accountUpdated = accounts.get(username);
		if(accountUpdated!=null)
		{
			if(accountUpdated.isStatus()) accountUpdated.setStatus(false);
			else
				accountUpdated.setStatus(true);
			return true;
		}
		return false;

	}

	public String validate(String username, String password) {
		Account accountExisting = accounts.get(username);
		if(accountExisting!=null)
		{
			if(!accountExisting.getPassword().equals(password)) 
					return "Password InCorrect";
				if(!accountExisting.isStatus())
					return "account deactivated";
					

			else	return "Welcome to my Site";
		}
		return "User Account does not exist";
	}

}
