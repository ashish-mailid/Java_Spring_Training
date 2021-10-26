package com.training.clients;

import com.training.classes.Building;

public class BuildingClient {

	public static void main(String[] args) {
		
		Building b1 = new Building("Salarpuria towers");
		Building.Room r1 = b1.new Room();
		r1.m1("local name");
		
		Building.Room1 r2 = new Building.Room1();
		r2.m1("name1");

	}

}
