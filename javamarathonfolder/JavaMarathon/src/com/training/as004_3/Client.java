package com.training.as004_3;

public class Client {

	public static void main(String[] args) {
	
		ListInterface<Integer> list1 = new MyList<>();
		list1.addElement(12);
		list1.addElement(15);
		list1.addElement(56, 2);
		System.out.println(list1);
		
		MyLinkedList<Integer> list2=new MyLinkedList<Integer>();
		list2.addElement(12);
		list2.addElement(15);
		list2.addElement(56);
		list2.addFirst(8);
		System.out.println(list2);
		
		ListInterface<String> list3 = new MyList<>();
		list3.addElement("abc");
		list3.addElement("xyz");
		list3.addElement("sam",1);
		System.out.println(list3);
		
	}

}
