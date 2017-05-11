package com.bit_i_know.algo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedHashMap;

/**
 * Find the First Non Repeating character
 * @author pradeep
 *
 */
public class FirstNonRepeatingCharacter {

	public static void main(String args[]) {
		String name = "pradeep";
		char firstCharacter = 0;
		Map<Character, Boolean> values = new LinkedHashMap<>();

		for (char character : name.toCharArray())
			values.put(character, values.containsKey(character) ? false : true);

		for (Entry<Character, Boolean> entry : values.entrySet()) {
			if (entry.getValue() == true) {
				firstCharacter = entry.getKey();
				break;
			}
		}
		System.out.println("First character is : " + firstCharacter);
	}

}