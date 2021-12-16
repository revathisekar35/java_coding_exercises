package com.techreturners.exercise001;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise001 {
	/**
	 * This method used to capitalise the first character of word
	 * 
	 * @param word
	 * @return word
	 */
	public String capitalizeWord(String word) {
		StringBuilder capitalizedWord = new StringBuilder();
		try {
			capitalizedWord.append(word.substring(0, 1).toUpperCase() + word.substring(1));
		} catch (NullPointerException ne) {
			System.out.println("word is null in capitalizeWord method " + ne.getMessage());
			ne.printStackTrace();
		}
		return capitalizedWord.toString();
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
		try {
			initials.append(firstName.substring(0, 1));
			initials.append("." + lastName.substring(0, 1));
		} catch (NullPointerException ne) {
			System.out.println("firstName or lastName is null in generateInitials method" + ne.getMessage());
			ne.getStackTrace();
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
		return Math.round(totalValue * 100.0) / 100.0;
	}

	/**
	 * This method used to return the reverse of given sentence
	 * 
	 * @param sentence
	 * @return string of reverse sentence
	 */
	public String reverse(String sentence) {
		StringBuilder reverseString = new StringBuilder();
		return reverseString.append(sentence).reverse().toString();
	}

	/**
	 * This method return the count of "Linux" users in the given list of users
	 * 
	 * @param users
	 * @return total count of linux users
	 */
	public int countLinuxUsers(List<User> users) {
		try {
			// Get linux user list size
			return users.stream().filter(user -> user.getType().equalsIgnoreCase("Linux")).collect(Collectors.toList())
					.size();
		} catch (NullPointerException ne) {
			System.out.println("users list is null in countLinuxUsers" + ne.getMessage());
			ne.printStackTrace();
		}
		return 0;
	}
}
