package com.qa.intermediate2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSets {

	public static void hashSet() {
		// ordered collection
		List<String> list = new ArrayList<>();
		list.add("audi");
		list.add("bmw");
		list.add("ford");
		list.add("ford");// allows duplicates
		System.out.println(list);

		// unordered collection
		Set<String> set = new HashSet<>();
		set.add("Kinder");
		set.add("Cadbury");
		set.add("Galaxy");
		set.add("Toblerone");
		set.add("Galaxy");// does not allow duplicates

		System.out.println(set);
		set.size();
		set.remove("Cadbury");
		System.out.println(set.isEmpty());
		System.out.println(set);

		System.out.println("------------Iterate");
		// can use the iterator to loop through the set and modify it, i.e: remove
		// values, add values, etc
		Iterator<String> loopy = set.iterator();
		while (loopy.hasNext()) {
			String val = loopy.next();
			System.out.println(val);// prints every value in the set individually
		}

	}

}
