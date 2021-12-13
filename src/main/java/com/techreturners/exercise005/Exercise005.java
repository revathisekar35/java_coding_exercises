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

			char[] arr = input.toCharArray();
			// Used Hashset to avoid duplicates of character
			HashSet<Character> set = new HashSet<>();

			for (char ch : arr) {
				if (Character.isLetter(ch))
					set.add(ch);
			}
			return (set.size() == 26);
		} else
			return false;
	}
}
