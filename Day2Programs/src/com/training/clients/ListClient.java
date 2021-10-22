package com.training.clients;

import com.training.classes1.MyArrayList;
import com.training.classes1.MySet;
import com.training.interfaces.MyCollection;

public class ListClient {

	public static void main(String[] args) {
		
		MyCollection<Integer> list = new MyArrayList<>();
		
		list.add(12);
		list.add(34);
		list.add(34);
		list.print();
		
		MyCollection<String> list1 = new MyArrayList<>();
		list1.add("abc");
		list1.add("peter");
		list1.print();
		
		list = new MySet<>();
		list.add(12);
		list.add(34);
		list.add(34);
		list.print();
	}
}
