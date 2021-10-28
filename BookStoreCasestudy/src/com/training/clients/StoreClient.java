package com.training.clients;

import java.util.List;
import java.util.Scanner;

import com.training.classes.Book;
import com.training.classes.Customer;
import com.training.dao.BookStoreDao;
import com.training.dao.LoginDao;

public class StoreClient {
	
	public static void main(String[] args) {
		
		menu();
		
	}

	public static void menu() {
		LoginDao loginDao = new LoginDao();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Credentials to proceed..");
		System.out.println("Enter Username");
		String username = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		Customer customer = loginDao.validate(username,password);
		if(customer!=null)
		{
			System.out.println("welcome "+customer.getName());
			
			//display all the Books in the store
			BookStoreDao bookDao  = new BookStoreDao();
			bookDao.getAllBooks();
			//read isbn from the customer
			// get book based on isbn and add to the Cart
			//Repeat adding the book
			//customer enters 0 to checkout 
			//views the bill when he checks out
		}
		
	}

	public static void print(List<Book> bookList) {
		bookList.forEach(System.out::println);
		
	}

}
