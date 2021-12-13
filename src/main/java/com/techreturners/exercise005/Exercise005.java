package com.techreturners.exercise005;

import java.util.HashSet;

public class Exercise005 {
	/**
	 * This method used to check whether the input string is Pangram or not
	 * regardless capital/small character
	 * 
	 * @param input
	 * @return true/false
	 */
	public boolean isPangram(String input) {
		if (input != null) {
			input = input.toUpperCase();
			char[] inputCharacterArr = input.toCharArray();
			// Used Hashset to avoid duplicates of character
			HashSet<Character> alphabet = new HashSet<>();
			new String(inputCharacterArr).chars().filter(c -> Character.isLetter(c))
					.forEach(c -> alphabet.add((char) c));
			return (alphabet.size() == 26);
		} else
			return false;
	}
}
