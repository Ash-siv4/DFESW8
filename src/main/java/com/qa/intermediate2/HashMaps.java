package com.qa.intermediate2;

import java.util.HashMap;

public class HashMaps {

	public static void hashMap() {
		// hashmap - key-value

		HashMap<String, String> cars = new HashMap<>();
		// adding to the hashmap - use .put instead of .add
		// key value
		cars.put("Ford", "Fiesta");
		cars.put("Nissan", "Micra");
		cars.put("Audi", "A1");
		cars.put("Chevy", "Camero");
		cars.put("ford", "Mondeo");// overwrite any previous values
		System.out.println(cars);
		System.out.println(cars.get("A1"));
		cars.remove("ford");
		System.out.println(cars);

		System.out.println(cars.size());
		System.out.println("------------keys");
		for (String i : cars.keySet()) {
			System.out.println(i);
		}

		System.out.println("------------values");
		for (String i : cars.values()) {
			System.out.println(i);
		}

	}
}
