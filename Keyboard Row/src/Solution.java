/*
500. Keyboard Row
Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
Example 1:
Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]
Note:
You may use one character in the keyboard more than once.
You may assume the input string will only contain letters of alphabet.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {


	public static String[] findWords(String[] words) {

		List<String> list = new ArrayList<>();

		for (int i = 0; i < words.length; i++) {
			boolean check = false;
			if (words[i].substring(0, 1).equalsIgnoreCase("q") || words[i].substring(0, 1).equalsIgnoreCase("w")
					|| words[i].substring(0, 1).equalsIgnoreCase("e") || words[i].substring(0, 1).equalsIgnoreCase("r")
					|| words[i].substring(0, 1).equalsIgnoreCase("t") || words[i].substring(0, 1).equalsIgnoreCase("y")
					|| words[i].substring(0, 1).equalsIgnoreCase("u") || words[i].substring(0, 1).equalsIgnoreCase("i")
					|| words[i].substring(0, 1).equalsIgnoreCase("o")
					|| words[i].substring(0, 1).equalsIgnoreCase("p")) {
				check = checkRowOne(words[i]);
			} else if (words[i].substring(0, 1).equalsIgnoreCase("a") || words[i].substring(0, 1).equalsIgnoreCase("s")
					|| words[i].substring(0, 1).equalsIgnoreCase("d") || words[i].substring(0, 1).equalsIgnoreCase("f")
					|| words[i].substring(0, 1).equalsIgnoreCase("g") || words[i].substring(0, 1).equalsIgnoreCase("h")
					|| words[i].substring(0, 1).equalsIgnoreCase("j") || words[i].substring(0, 1).equalsIgnoreCase("k")
					|| words[i].substring(0, 1).equalsIgnoreCase("l")) {
				check = checkRowTwo(words[i]);
			} else if (words[i].substring(0, 1).equalsIgnoreCase("z") || words[i].substring(0, 1).equalsIgnoreCase("x")
					|| words[i].substring(0, 1).equalsIgnoreCase("c") || words[i].substring(0, 1).equalsIgnoreCase("v")
					|| words[i].substring(0, 1).equalsIgnoreCase("b") || words[i].substring(0, 1).equalsIgnoreCase("n")
					|| words[i].substring(0, 1).equalsIgnoreCase("m")) {
				check = checkRowThree(words[i]);
			}
			if (check) {
				list.add(words[i]);
			}
		}
		
		
		String[] result = new String[list.size()];
		for(int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}

		return result;

	}

	private static boolean checkRowOne(String s) {

		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equalsIgnoreCase("q") || s.substring(i, i + 1).equalsIgnoreCase("w")
					|| s.substring(i, i + 1).equalsIgnoreCase("e") || s.substring(i, i + 1).equalsIgnoreCase("r")
					|| s.substring(i, i + 1).equalsIgnoreCase("t") || s.substring(i, i + 1).equalsIgnoreCase("y")
					|| s.substring(i, i + 1).equalsIgnoreCase("u") || s.substring(i, i + 1).equalsIgnoreCase("i")
					|| s.substring(i, i + 1).equalsIgnoreCase("o") || s.substring(i, i + 1).equalsIgnoreCase("p")) {
			} else {
				return false;
			}
		}

		return true;
	}

	private static boolean checkRowTwo(String s) {

		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equalsIgnoreCase("a") || s.substring(i, i + 1).equalsIgnoreCase("s")
					|| s.substring(i, i + 1).equalsIgnoreCase("d") || s.substring(i, i + 1).equalsIgnoreCase("f")
					|| s.substring(i, i + 1).equalsIgnoreCase("g") || s.substring(i, i + 1).equalsIgnoreCase("h")
					|| s.substring(i, i + 1).equalsIgnoreCase("j") || s.substring(i, i + 1).equalsIgnoreCase("k")
					|| s.substring(i, i + 1).equalsIgnoreCase("l")) {
			} else {
				return false;
			}
		}

		return true;
	}

	private static boolean checkRowThree(String s) {

		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equalsIgnoreCase("z") || s.substring(i, i + 1).equalsIgnoreCase("x")
					|| s.substring(i, i + 1).equalsIgnoreCase("c") || s.substring(i, i + 1).equalsIgnoreCase("v")
					|| s.substring(i, i + 1).equalsIgnoreCase("b") || s.substring(i, i + 1).equalsIgnoreCase("n")
					|| s.substring(i, i + 1).equalsIgnoreCase("m")) {
			} else {
				return false;
			}
		}

		return true;
	}

}
