/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
*/

public class Solution {

	public static String convert(String s, int numRows) {
		
		if(s.length() == 0 || s == null) {
			return "";
		}
		
		if(s.length() == 1 || numRows == 1) {
			return s;
		}
		
		String[] strings = new String[numRows]; // creates a string for each row
		int index = 0; // substring index position
		int arrayIndexPosition = 0; // selects next string to add to in strings array

		if(s.length() < numRows) {
			String result = "";
			for (int i = 0; i < s.length(); i++) {
				strings[i] = s.substring(index, index + 1);
				result += strings[i];
				index++;
				arrayIndexPosition++;
			}

			return result;
			
		}
		
		// set first character in each row
		for (int i = 0; i < numRows; i++) {
			strings[i] = s.substring(index, index + 1);
			index++;
			arrayIndexPosition++;
		}

		arrayIndexPosition--;
		// iterate through each character of the s String

		while (index < s.length()) {
			// starts at beginning of aIP, moves forward to end limit of aIP
			// adding new character to each String in array
			if (arrayIndexPosition == 0) {
				while (arrayIndexPosition < numRows - 1) {
					arrayIndexPosition++;
					strings[arrayIndexPosition] += s.substring(index, index + 1);
					index++;
					if (index >= s.length()) {
						break;
					}
				}
				if (arrayIndexPosition == numRows) {
					arrayIndexPosition--;
				}
				if (index >= s.length()) {
					break;
				}
			}
			if (arrayIndexPosition == numRows - 1) {
				while (arrayIndexPosition > 0) {
					arrayIndexPosition--;
					strings[arrayIndexPosition] += s.substring(index, index + 1);
					index++;
					if (index >= s.length()) {
						break;
					}
				}
			}

		}

		// build the final converted string
		String result = "";
		for (int i = 0; i < numRows; i++) {
			result += strings[i];
			System.out.println(result);
		}

		return result;
	}

}
