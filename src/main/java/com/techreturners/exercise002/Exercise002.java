package com.techreturners.exercise002;

public class Exercise002 {
	/**
	 * This method is to check the person from "Manchester" city or not
	 * 
	 * @param person
	 * @return boolean
	 */
	public boolean isFromManchester(Person person) {
		try {
			return person.getCity().equalsIgnoreCase("Manchester");
		} catch (NullPointerException ne) {
			System.out.println("person is null in isFromManchester method" + ne.getMessage());
			ne.printStackTrace();
		}
		return false;
	}

	/**
	 * This methods determines whether the person is allowed to watch film or not
	 * 
	 * @param person
	 * @param ageLimit
	 * @return boolean
	 */
	public boolean canWatchFilm(Person person, int ageLimit) {
		try {
			return person.getAge() >= 18;
		} catch (NullPointerException ne) {
			System.out.println("person is null in canWatchFilm " + ne.getMessage());
			ne.printStackTrace();
		}
		return false;
	}
}
