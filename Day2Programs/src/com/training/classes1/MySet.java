package com.training.classes1;

import com.training.interfaces.MyCollection;

public class MySet<T> implements MyCollection<T> {

	private final int SIZE =10;
	private Object array[] = new Object[SIZE];
	private int count;
	
	@Override
	public void add(T t) {
		
		if(!isPresent(t))
			array[count++]=t;
			
	}

	private boolean isPresent(T t) {
		for(int i=0;i<count;i++)
			if(array[i]==t)
				return true;
		return false;
	}

	@Override
	public void print() {
		for(int i=0;i<count;i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
