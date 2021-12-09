package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise001 {
	/**
	 * This method used to capitalise the first character of word
	 * 
	 * @param word
	 * @return word
	 */
	public String capitalizeWord(String word) {
		// To check given string is null or empty
		if (word == null || word.isEmpty()) {
			return word;
		}
		return word.substring(0, 1).toUpperCase() + word.substring(1);
	}

	/**
	 * This method used to generate initials combination of firstName and lastname
	 * 
	 * @param firstName
	 * @param lastName
	 * @return string (initials of firstName.lastName)
	 */
	public String generateInitials(String firstName, String lastName) {
		StringBuilder initials = new StringBuilder();
		if (firstName != null && !firstName.isEmpty()) {
			initials.append(firstName.substring(0, 1));

		}
		if (lastName != null && !lastName.isEmpty()) {
			initials.append("." + lastName.substring(0, 1));

		}

		return initials.toString();
	}

	/**
	 * This method used to calculate vat value and return the total price
	 * 
	 * @param originalPrice
	 * @param vatRate
	 * @return Total price
	 */
	public double addVat(double originalPrice, double vatRate) {
		// calculating vat price and adding the vat price to original price
		double totalValue = ((vatRate / 100) * originalPrice) + originalPrice;
		// Formating the decimal value to 2 digits
		double finalValue = Math.round(totalValue * 100.0) / 100.0;
		return finalValue;
	}

	/**
	 * This method used to return the reverse of given sentence
	 * 
	 * @param sentence
	 * @return string of reverse sentence
	 */
	public String reverse(String sentence) {
		// check the sentence is null or empty if yes return it.
		if (sentence == null || sentence.isEmpty()) {
			return sentence;
		}
		StringBuilder reverseString = new StringBuilder(sentence);
		return reverseString.reverse().toString();
	}

	/**
	 * This method return the count of "Linux" users in the given list of users
	 * 
	 * @param users
	 * @return total count of linux users
	 */
	public int countLinuxUsers(List<User> users) {
		// check users list is null or empty
		if (users == null || users.isEmpty()) {
			return 0;
		}
		//Get linux user list size
		int linuxUser = users.stream().filter(user -> user.getType().equalsIgnoreCase("Linux"))
				.collect(Collectors.toList()).size();
		return linuxUser;
	}
}
