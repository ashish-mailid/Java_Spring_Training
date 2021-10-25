package com.training.as005_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class RestaurantDemo {
	private Map<String,List<Menu>> rMap=new TreeMap<>();
	
	{
		List<Menu> list1=Arrays.asList(new Menu("pizza", 350.50),new Menu("pasta", 250.60));
		List<Menu> list2=Arrays.asList(new Menu("pizza", 350.50),new Menu("Garlic Bread", 250.60));
		
		rMap.put("Pizza Hut",list1); rMap.put("Dominos",list2);
		
	}
	
	public List<Menu> getMenu(String rName)
	{
		return rMap.get(rName);
	}
	
	public List<String>  getAllRestaurants(String dishName)
	{
		Set<Entry<String,List<Menu>>> entries = rMap.entrySet();
		List<String> rNames=new ArrayList<>();
		
		for(Entry<String,List<Menu>> entry:entries)
		{
			//System.out.println(entry.getKey()+" "+entry.getValue());
			
			List<Menu> listDishes = entry.getValue();
			for(Menu menu:listDishes)
			{
				if(menu.getDish().equalsIgnoreCase(dishName))
				rNames.add(entry.getKey());
			}
		}
		return rNames;
	}
	
	public static void main(String[] args) {
		RestaurantDemo rDemo = new RestaurantDemo();
		System.out.println(rDemo.getMenu("Pizza Hut"));
		System.out.println(rDemo.getAllRestaurants("Pasta"));
	}
}
