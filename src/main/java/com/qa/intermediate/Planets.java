package com.qa.intermediate;

public enum Planets {

	MERCURY(1, 3), VENUS(2, 123), EARTH(3, 54), MARS(4, 53), JUPITER(5, 64), SATURN(6, 543), URANUS(7, 48),
	NEPTUNE(8, 345);

	final int d;
	final int s;
	static final int c = 3;

	Planets(int distance, int size) {
		this.d = distance;
		this.s = size;
	}
	
	public int calc() {
		return d*s;
	}

}
