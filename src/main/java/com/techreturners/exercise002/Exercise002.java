package com.techreturners.exercise002;

public class Exercise002 {
	/**
	 * This method is to check the person from "Manchester" city or not
	 * 
	 * @param person
	 * @return boolean
	 */
	public boolean isFromManchester(Person person) {
		if (person != null && person.getCity() != null) {
			return person.getCity().equalsIgnoreCase("Manchester");
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
		if (person != null) {
			return person.getAge() >= 18;
		}
		return false;
	}

}
