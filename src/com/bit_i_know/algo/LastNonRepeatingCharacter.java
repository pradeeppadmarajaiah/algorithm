package com.bit_i_know.algo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedHashMap;

/**
 * Find the Last Non Repeating character
 * 
 * @author pradeep
 *
 */
public class LastNonRepeatingCharacter {

	public static void main(String args[]) {
		String name = "pradeep";
		char lastCharacter = 0;
		Map<Character, Boolean> values = new LinkedHashMap<>();

		for (char character : name.toCharArray())
			values.put(character, values.containsKey(character) ? false : true);

		for (Entry<Character, Boolean> entry : values.entrySet()) {
			if (entry.getValue() == true) {
				lastCharacter = entry.getKey();
			}
		}
		System.out.println("Last character is : " + lastCharacter);
	}

}