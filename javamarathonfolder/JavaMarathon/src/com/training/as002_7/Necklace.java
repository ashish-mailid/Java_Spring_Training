package com.training.as002_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Necklace {
	
	//private List<Pearl> pearls = new ArrayList<>();
	private Pearl[] pearls;
	private final int SIZE = 2;
	private static int count;
	
	public Necklace(Pearl pearl)
	{
		pearls = new Pearl[SIZE];
		pearls[count++] = pearl;
	}
	
	public boolean addPearl(Pearl pearl)
	{
		if(count < SIZE) {
			pearls[count++] = pearl;
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		return Arrays.toString(pearls);
	}

	public static int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

}
