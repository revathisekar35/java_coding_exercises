package com.techreturners.exercise002;
/**
 * This class maintains the person details
 * @author revathi
 *
 */
public class Person {
	private String firstName;
	private String lsatName;
	private String city;
	private int age;

	public Person(String firstName, String lastName, String city, int age) {
		this.firstName = firstName;
		this.lsatName = lastName;
		this.city = city;
		this.age =age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLsatName() {
		return lsatName;
	}

	public String getCity() {
		return city;
	}

	public int getAge() {
		return age;
	}

}
