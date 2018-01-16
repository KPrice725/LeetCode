/*
13. Roman to Integer
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.


*/
public class Solution {

	public int romanToInt(String s) {

		int result = 0;
		int[] values = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'M':
				values[i] = 1000;
				break;
			case 'D':
				values[i] = 500;
				break;
			case 'C':
				values[i] = 100;
				break;
			case 'L':
				values[i] = 50;
				break;
			case 'X':
				values[i] = 10;
				break;
			case 'V':
				values[i] = 5;
				break;
			case 'I':
				values[i] = 1;
				break;
			default:
			}
		}

		for (int i = 0; i < values.length - 1; i++) {
			if (values[i] < values[i + 1]) {
				result -= values[i];
			} else {
				result += values[i];
			}
		}

		return result + values[values.length - 1];

	}

}
