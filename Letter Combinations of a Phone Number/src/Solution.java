
/*
17. Letter Combinations of a Phone Number

Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.



Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
Note:
Although the above answer is in lexicographical order, your answer could be in any order you want.

*/
import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static List<String> letterCombinations(String digits) {

		List<String> result = new ArrayList<>();

		String[] two = { "a", "b", "c" };
		String[] three = { "d", "e", "f" };
		String[] four = { "g", "h", "i" };
		String[] five = { "j", "k", "l" };
		String[] six = { "m", "n", "o" };
		String[] seven = { "p", "q", "r", "s" };
		String[] eight = { "t", "u", "v" };
		String[] nine = { "w", "x", "y", "z" };

		if (digits == null || digits.length() == 0) {
			return result;
		}

		switch (digits.substring(0, 1)) {
		case "2":
			for (String s : two) {
				result.add(s);
			}
			break;

		case "3":
			for (String s : three) {
				result.add(s);
			}
			break;

		case "4":
			for (String s : four) {
				result.add(s);
			}
			break;

		case "5":
			for (String s : five) {
				result.add(s);
			}
			break;

		case "6":
			for (String s : six) {
				result.add(s);
			}
			break;

		case "7":
			for (String s : seven) {
				result.add(s);
			}
			break;

		case "8":
			for (String s : eight) {
				result.add(s);
			}
			break;

		case "9":
			for (String s : nine) {
				result.add(s);
			}
			break;

		default:

		}

		for (int i = 1; i < digits.length(); i++) {
			List<String> tempData = new ArrayList<>();

			switch (digits.substring(i, i + 1)) {
			case "2":
				for (String s : result) {
					for (String n : two) {
						tempData.add(s + n);
					}
				}
				break;
			case "3":
				for (String s : result) {
					for (String n : three) {
						tempData.add(s + n);
					}
				}
				break;
			case "4":
				for (String s : result) {
					for (String n : four) {
						tempData.add(s + n);
					}
				}
				break;
			case "5":
				for (String s : result) {
					for (String n : five) {
						tempData.add(s + n);
					}
				}
				break;

			case "6":
				for (String s : result) {
					for (String n : six) {
						tempData.add(s + n);
					}
				}
				break;

			case "7":
				for (String s : result) {
					for (String n : seven) {
						tempData.add(s + n);
					}
				}
				break;

			case "8":
				for (String s : result) {
					for (String n : eight) {
						tempData.add(s + n);
					}
				}
				break;

			case "9":
				for (String s : result) {
					for (String n : nine) {
						tempData.add(s + n);
					}
				}
				break;

			default:

			}
			result = tempData;

		}

		return result;
	}

}
