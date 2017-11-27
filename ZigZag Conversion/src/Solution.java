
public class Solution {

	public static void main(String[] args) {
		System.out.println(convert("AB", 8));
	}

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
