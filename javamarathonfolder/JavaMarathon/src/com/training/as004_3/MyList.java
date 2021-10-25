package com.training.as004_3;

import java.util.Arrays;

public class MyList<T> implements ListInterface<T> {
	private static  final int  SIZE=5;
	Object objects[] = new Object[SIZE];
	private int index;

	@Override
	public void addElement(T t) {
		if(index < SIZE)
		objects[index++] = t;

	}

	@Override
	public void addElement(T t, int index) {
		if(index < SIZE)
		{
			for(int i=objects.length-1;i>=index;i--)
				objects[i] = objects[i-1];
		objects[index] = t;
		}

	}

	public String toString()
	{
		return Arrays.toString(objects);
	}
}
