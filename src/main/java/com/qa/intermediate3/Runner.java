package com.qa.intermediate3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		
		//------------- Optionals -------------
		//Example 1
		String str = "ash" + "Siv";
//		System.out.println(str.toUpperCase());
		String str2 = null;
//		System.out.println(Optional.ofNullable(str2));
		//Example 2
		String item;
		if(Math.random() >= 0.5) {
			item = "hi";
		}else {
			item = null;
		}
//		System.out.println(Optional.ofNullable(item));
//		
//		Optional<String> ret = Optional.ofNullable(item);
//		System.out.println(ret.isPresent());//checking if the optional is available or not and returns a boolean
//		System.out.println(ret.orElse("nothing"));//if you return false - is empty, then print "nothing"
		
		//------------- Lamdas ---------------
		
		//lambdas - functions - parameters & body
		//methods - parameters, body, return type, method name
		
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		System.out.println("------lambda version");
		//
		nums.forEach(par1 -> System.out.println(par1 * par1));

		System.out.println("------method version");
		square();
		
		
		//-------------- STREAMS -------------
		// a way to process a collection of objects in a pipeline manner
		System.out.println("--------streams");
		List<Integer> list = Arrays.asList(2,4,6,8);
		//for-each
		list.stream().forEach(x -> System.out.println(x*x*x));
		//map
		List<Integer> cube =  list.stream().map(x -> x*x*x).collect(Collectors.toList());
		System.out.println("cubes:" + cube);
		
	}

	public static void square() {
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);

		for (int i : nums) {
			System.out.println(i * i);
		}
	}

}
