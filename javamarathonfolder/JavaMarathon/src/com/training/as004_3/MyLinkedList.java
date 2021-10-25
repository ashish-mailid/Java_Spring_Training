package com.training.as004_3;

public class MyLinkedList<T> implements CollectionInterface<T>{
	
	class Node<T>
	{
		T data;
		Node next;
		int index;
	}
	Node first = null;

	@Override
	public void addElement(T t) {
		Node node = new Node();
		node.data=t;
		node.next=null;
		node.index=0;
		
		if(first==null) {
			first = node;
			node.index=0;
		}
		else
		{
			Node ptr=first;
			for(;ptr.next!=null;ptr=ptr.next);
			node.next=ptr.next;
			ptr.next=node;
			node.index=ptr.index + 1;
		}
		
	}

	
	public void addFirst(T t)
	{
		Node node = new Node();
		node.data=t;
		node.next=first;
		first = node;
		
	}
	public String toString()
	{
		StringBuffer sb=new StringBuffer();
		Node ptr=first;
		for(;ptr!=null;ptr=ptr.next)
			sb.append("["+ptr.data+" "+ptr.index+"]");
		
		return sb.toString();
	}

}
