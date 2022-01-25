package com.qa.intermediate;

public class Person<E, T> {

	//variables
	private E name;
	private T age;
	
	//default constructor
	public Person() {
		
	}
	
	
	//constructor	
	public Person(E name, T age) {
		super();
		this.name = name;
		this.age = age;
	}


	//getters & setters
	public E getName() {
		return name;
	}


	public void setName(E name) {
		this.name = name;
	}


	public T getAge() {
		return age;
	}


	public void setAge(T age) {
		this.age = age;
	}
	
	
	
	
}
