package com.javafans.practise.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AutoCompleteDao {
	
	private static final List restaurantsList;
	static {
		restaurantsList = new ArrayList<>();
		restaurantsList.add("Jalpaan (Jayanagar)");
		restaurantsList.add("Jai Hind");
		restaurantsList.add("Dominos (Jayanagar)");
		restaurantsList.add("Dominos (JP nagar 1st Phase)");
		restaurantsList.add("DER ");
		restaurantsList.add("Eshanya");
		restaurantsList.add("eat.fit");
		restaurantsList.add("Sattvikk");
		restaurantsList.add("Shrinathji");
		restaurantsList.add("Little Italy");
		restaurantsList.add("Kamat Hotel");
		restaurantsList.add("Konark Hotel (Residency Road)");
		restaurantsList.add("Konark Hotel (Kanteerava Stadium)");
		restaurantsList.add("Woodys (JP Nagar)"	);
		restaurantsList.add("Woodys (MG Road)");
	}

	public static List getRestaurantsList(final String input) {
		return (List) restaurantsList.stream().filter(s -> ((String) s).toLowerCase().contains(input.toLowerCase())).collect(Collectors.toList());
	}
	
	

}
