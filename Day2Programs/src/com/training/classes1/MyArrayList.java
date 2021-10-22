package com.training.classes1;

import com.training.interfaces.MyCollection;

public class MyArrayList<E> implements MyCollection<E> {

	private final int SIZE=10;
	private Object array[]=new Object[SIZE];
	private int count;
	
	
	@Override
	public void print() {
		
		for(int i=0;i<count;i++)
		{
			System.out.println(array[i]);
		}
		
	}

	@Override
	public void add(E t) {
		if(count < SIZE)
			array[count++] = t;
		
	}

}
