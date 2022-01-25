package com.qa.intermediate;

import java.util.ArrayList;

public class Runner {
	Planets p;
	
	public Runner(Planets p) {
		this.p=p;
	}

	public static void main(String[] args) {
		
//		ArrayList<Integer> abc =  new ArrayList<>();
		
		Person<String, Integer> a = new Person<String, Integer>("ASH", 24);
		System.out.println(a.getName());
		
//		Person b = new Person();
//		System.out.println(b.getName());
		
		
		// TODO Auto-generated method stub

		System.out.println(Planets.EARTH.calc());

		String str = "VENUS";
		Runner x = new Runner(Planets.valueOf(str));
		System.out.println(Planets.MERCURY.s);
		x.location();
		
	}

	public void location() {
		switch (p) {
		case MERCURY:
			System.out.println("1st planet");
			break;
		case VENUS:
			System.out.println("2nd planet");
			break;
		case EARTH:
			System.out.println("3rd planet");
			break;
		default:
			System.out.println("bye");
		}
	}

}
